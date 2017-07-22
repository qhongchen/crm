<template>
  <div id="app" >

    <el-row id="header">
      <el-col :span="22">
        <div style="height: 80px; background: #20A0FF;line-height: 80px;padding-left: 10px" >
          <label style="font-size: 20px;color: #F9FAFC">xxxx客户关系管理系统</label>
        </div>
      </el-col >
      <el-col :span="2">
        <div style="height: 80px; background: #20A0FF;line-height: 80px;">
          <el-button @click="logout" >退出系统&nbsp;<i class="el-icon-arrow-right"></i></el-button>
        </div>
      </el-col>
    </el-row>

    <el-row  id="container"  :gutter="10" >
      <el-col :span="4" >
        <div id="left" style="">
          <el-menu mode="vertical">
            <el-submenu index="1" >
              <template slot="title"><i class="el-icon-message"></i>销售机会管理</template>
              <el-menu-item index="1-1">销售机会管理</el-menu-item>
              <el-menu-item index="1-2" disabled="true" route="">客户开发计划</el-menu-item>
            </el-submenu>
            <el-submenu index="2">
              <template slot="title"><i class="el-icon-message"></i>客户管理</template>
              <el-menu-item index="2-1" >客户消息管理</el-menu-item>
              <el-menu-item index="2-2">客户流失管理</el-menu-item>
            </el-submenu>
            <el-submenu index="3">
              <template slot="title"><i class="el-icon-message"></i>服务管理</template>
              <el-menu-item index="3-1">服务创建</el-menu-item>
              <el-menu-item index="3-2">服务分配</el-menu-item>
              <el-menu-item index="3-3">服务处理</el-menu-item>
              <el-menu-item index="3-4">服务反馈</el-menu-item>
              <el-menu-item index="3-5">服务归档</el-menu-item>
            </el-submenu>
            <el-submenu index="4">
              <template slot="title"><i class="el-icon-message"></i>统计报表</template>
              <el-menu-item index="4-1">客户贡献分析</el-menu-item>
              <el-menu-item index="4-2" >客户构成分析</el-menu-item>
              <el-menu-item index="4-3">客户服务分析</el-menu-item>
              <el-menu-item index="4-4">客户流失分析</el-menu-item>
            </el-submenu>
            <el-submenu index="5">
              <template slot="title"><i class="el-icon-message"></i>基础数据</template>
              <el-menu-item index="5-1">数据字典管理</el-menu-item>
              <el-menu-item index="5-2">查询产品信息</el-menu-item>
              <el-menu-item index="5-3">查询库存</el-menu-item>
            </el-submenu>
          </el-menu>
        </div>
      </el-col>
      <el-col id="main" :span="20">
        <div style="height: 550px">
          <router-view></router-view>
        </div>
      </el-col>
    </el-row>

    <el-row >
      <el-col :span="24">
        <div  id="footer" align="center">
          预留给版本信息的位置
        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script>
  export default {
    name: 'app',
    methods:{
      logout :function () {
          alert("退出系统")
      }
    }
  }
</script>

<style>
  body{
    width: 99%;
    margin-left: 5px;
  }
  #left{
    height: auto;
    min-height: 550px;
    background: #EFF2F7
  }

  #footer{
    border: solid 1px black;
    height: 50px;
  }

  .el-row {
    margin-bottom: 5px;
  }

</style>
