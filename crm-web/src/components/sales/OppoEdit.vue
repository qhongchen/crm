<template>
  <div>
    <el-button @click="dialogFormVisible = true" size="small">编辑</el-button>

    <el-dialog title="销售机会管理 > 修改销售机会" :visible.sync="dialogFormVisible">
      <el-form v-model="oppo">
        <el-form-item align="center">
          <el-col span="3" offset="2">编号:</el-col>
          <el-col span="6">
            <el-input auto-complete="off"  v-model="oppo.salesId" disabled></el-input>
          </el-col>
          <el-col span="3">机会来源:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" v-model="oppo.salesOppoSource"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">客户名称:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" v-model="oppo.salesClientName"></el-input>
          </el-col>
          <el-col span="3">成功机率:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" v-model="oppo.salesProbability"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">概要:</el-col>
          <el-col span="15">
            <el-input auto-complete="off" v-model="oppo.salesDesc"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">联系人:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" v-model="oppo.salesPerson"></el-input>
          </el-col>
          <el-col span="3">联系电话:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" v-model="oppo.salesPhone"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">机会描述:</el-col>
          <el-col span="15">
            <el-input type="textarea" :autosize="{ minRows: 2}" v-model="oppo.salesOppoDesc"></el-input>
          </el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">创建人:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" disabled v-model="oppo.salesCreateUserId"></el-input>
          </el-col>
          <el-col span="3">创建时间:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" disabled v-model="oppo.salesCreateTime"></el-input>
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
      oppo : Object,
    },
    data() {
      return {
        dialogFormVisible: false,
      };
    },
    methods: {
      save() {

        sandBox.APIs.oppo.updata({
          data : require('qs').stringify(this.oppo),
          success: function (data) {

              this.$store.dispatch('updateOppo', data);
              this.$message({
                message:"修改成功",
                type:"success"
              });

          }.bind(this)
        });
        this.dialogFormVisible = false
      },
      cancle(){

        this.$message('取消编辑');
        sandBox.APIs.oppo.get({
          params: {
            id: this.id
          },
          success : function (data) {
            this.oppo = data
          }.bind(this)
        });

        this.dialogFormVisible = false
      }
    }
  };
</script>


<style></style>
