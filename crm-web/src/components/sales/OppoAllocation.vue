<template>
  <div>
    <el-button @click="dialogFormVisible = true" size="small">指派</el-button>

    <el-dialog title="销售机会管理 > 指派销售机会" :visible.sync="dialogFormVisible">
      <el-form v-model="oppo">
        <el-form-item align="center">
          <el-col span="3" offset="2">编号:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesId" disabled></el-input>
          </el-col>
          <el-col span="3">机会来源:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesOppoSource" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">客户名称:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesClientName" disabled></el-input>
          </el-col>
          <el-col span="3">成功机率:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesProbability" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">概要:</el-col>
          <el-col span="15">
            <el-input v-model="oppo.salesDesc" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">联系人:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesPerson" disabled></el-input>
          </el-col>
          <el-col span="3">联系电话:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesPhone" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">机会描述:</el-col>
          <el-col span="15">
            <el-input type="textarea" :autosize="{ minRows: 2}" v-model="oppo.salesOppoDesc" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">创建人:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesCreateUserId" disabled></el-input>
          </el-col>
          <el-col span="3">创建时间:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesCreateTime" disabled></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">指派给:</el-col>
          <el-col span="6">
            <el-select v-model="oppo.salesAllocationUserId" placeholder="请选择">
              <el-option
                v-for="item in userlist"
                :key="item.userId"
                :label="item.userName"
                :value="item.userId">
              </el-option>
            </el-select>
          </el-col>
          <el-col span="3">指派时间:</el-col>
          <el-col span="6">
            <el-input v-model="oppo.salesAllocationTime"></el-input>
          </el-col>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click=" cancle()">取 消</el-button>
        <el-button type="primary" @click=" save()">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  export default {
    props: {
      oppo: Object,
    },
    mounted: function () {
      sandBox.APIs.user.list({
        params: {
          power: 4,
        },
        success: function (data) {
          this.userlist = data;
        }.bind(this)
      })

      this.oppo.salesAllocationTime = new Date().getFullYear() + "-" + (new Date().getMonth() + 1) + "-" + new Date().getDate();
    },
    data() {
      return {
        dialogFormVisible: false,
        userlist: null,
      };
    },
    methods: {
      save() {

        this.oppo.salesAllocationStatus = 1;

        sandBox.APIs.oppo.updata({
          data: require('qs').stringify(this.oppo),
          success: function (data) {
            this.$store.dispatch('updateOppo', data);
            this.$message("指派成功");
          }
        });

        this.dialogFormVisible = false
      },
      cancle(){

        this.$message('取消编辑');

        this.dialogFormVisible = false
      }
    }
  };
</script>


<style></style>
