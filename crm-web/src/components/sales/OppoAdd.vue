<template>
  <div>
    <el-button @click="dialogFormVisible = true">新建</el-button>

    <el-dialog title="销售机会管理 > 新建销售机会" :visible.sync="dialogFormVisible">
      <el-form :model="oppo" :rules="rules" label-width="90px">
        <el-row>
          <el-col span="9" offset="2">
            <el-form-item label="编号:">
              <el-input v-model="oppo.salesId" disabled placeholder="系统自动生成"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="9">
            <el-form-item label="机会来源:">
              <el-input v-model="oppo.salesOppoSource"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col span="9" offset="2">
            <el-form-item prop="salesClientName" label="客户名称:">
              <el-input v-model="oppo.salesClientName"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="9">
            <el-form-item prop="salesProbability" label="成功机率:">
              <el-input v-model="oppo.salesProbability"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col span="18" offset="2">
            <el-form-item prop="salesDesc" label="概要:">
              <el-input v-model="oppo.salesDesc"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col span="9" offset="2">
            <el-form-item label="联系人:">
              <el-input v-model="oppo.salesPerson"></el-input>
            </el-form-item>
          </el-col>
          <el-col span="9">
            <el-form-item label="联系电话:">
              <el-input v-model="oppo.salesPhone"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col span="18" offset="2">
            <el-form-item prop="salesOppoDesc" label="机会描述:">
              <el-input type="textarea" :autosize="{ minRows: 2}" v-model="oppo.salesOppoDesc"></el-input>
            </el-form-item>
          </el-col>
        </el-row>
        <el-row>
          <el-col span="9" offset="2">
            <el-form-item label="创建人:">
              <el-input v-model="username" disabled></el-input>
            </el-form-item>
          </el-col>
          <el-col span="9">
            <el-form-item label="创建时间:">
              <el-input v-model="oppo.salesCreateTime" disabled></el-input>
            </el-form-item>
          </el-col>
        </el-row>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click=" save()">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        dialogFormVisible: false,
        oppo: {
          salesCreateUserId: JSON.parse(sessionStorage.loginedUser).userId,
          salesCreateTime: new Date().getFullYear() + "-" + (new Date().getMonth() + 1) + "-" + new Date().getDate()
        },
        username: JSON.parse(sessionStorage.loginedUser).userName,
        rules: {
          salesClientName: [
            {required: true, message: '请输入客户名称', trigger: 'blur'}
          ],
          salesProbability: [
            {required: true, message: '请输入成功概率', trigger: 'blur'}
          ],
          salesDesc: [
            {required: true, message: '请输入概要', trigger: 'blur'}
          ],
          salesOppoDesc: [
            {required: true, message: '请输入机会描述', trigger: 'blur'}
          ],
        },
      };
    },
    methods: {
      save() {

        sandBox.APIs.oppo.add({
          data : require('qs').stringify(this.oppo),
          success : function (data) {
            this.$store.dispatch('saveOppo', data);
            this.$message({
              message: "添加成功",
              type: "success"
            });
          }.bind(this)
        });

        this.dialogFormVisible = false
      },
    }
  };
</script>


<style></style>
