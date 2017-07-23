<template>
  <div>
    <el-button @click="dialogFormVisible = true">新建</el-button>

    <el-dialog title="销售机会管理 > 新建销售机会" :visible.sync="dialogFormVisible">
      <el-form :model="oppo">
        <el-form-item align="center">
          <el-col span="3" offset="2">编号:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesId" auto-complete="off" disabled placeholder="系统自动生成"></el-input></el-col>
          <el-col span="3">机会来源:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesOppoSource" auto-complete="off"></el-input></el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">客户名称:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesClientName" auto-complete="off"></el-input></el-col>
          <el-col span="3">成功机率:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesProbability" auto-complete="off"></el-input></el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">概要:</el-col>
          <el-col span="15"><el-input v-model="oppo.salesDesc" auto-complete="off"></el-input></el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">联系人:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesPerson" auto-complete="off"></el-input></el-col>
          <el-col span="3">联系电话:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesPhone" auto-complete="off"></el-input></el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">机会描述:</el-col>
          <el-col span="15"><el-input type="textarea" :autosize="{ minRows: 2}" v-model="oppo.salesOppoDesc"></el-input></el-col>
        </el-form-item>
        <el-form-item align="center">
          <el-col span="3" offset="2">创建人:</el-col>
          <el-col span="6"><el-input auto-complete="off" disabled></el-input></el-col>
          <el-col span="3">创建时间:</el-col>
          <el-col span="6"><el-input v-model="oppo.salesCreateTime" auto-complete="off" disabled></el-input></el-col>
        </el-form-item>
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
        oppo: {},
      };
    },
    methods :{
      save() {
      },
    }
  };
</script>


<style></style>
