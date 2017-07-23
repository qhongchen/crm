<template>
  <div>
    <el-row :gutter="10" style="margin-bottom: 20px; margin-top: 10px">
      <el-col :span="3">
        <el-input placeholder="请输入客户名称" v-model="clientName"></el-input>
      </el-col>
      <el-col :span="3">
        <el-input placeholder="请输入概要" v-model="desc"></el-input>
      </el-col>
      <el-col :span="3">
        <el-input placeholder="请输入联系人" v-model="person"></el-input>
      </el-col>
      <el-col :span="2" align="center">
        <el-button @click="find">查询</el-button>
      </el-col>
      <oppoadd></oppoadd>
    </el-row>
    <el-row>
      <el-col :span="24">
        <el-table :data="oppoList" height="450" border style="width: 99%">
          <el-table-column
            prop="salesId"
            label="编号"
            width="100px">
          </el-table-column>
          <el-table-column
            prop="salesClientName"
            label="客户名称"
            width="180px">
          </el-table-column>
          <el-table-column
            prop="salesDesc"
            label="概要">
          </el-table-column>
          <el-table-column
            prop="salesPerson"
            label="联系人">
          </el-table-column>
          <el-table-column
            prop="salesPhone"
            label="联系人电话">
          </el-table-column>
          <el-table-column
            prop="salesCreateTime"
            label="创建时间">
          </el-table-column>
          <el-table-column label="操作">
            <template scope="scope">
              <el-col :span="10">
                <oppoedit :id="scope.row.salesId"></oppoedit>
              </el-col>
              <el-col :span="10">
                <el-button size="small" type="danger" @click="delete1(scope.$index,scope.row.salesId)">删除</el-button>
              </el-col>
            </template>
          </el-table-column>
        </el-table>
      </el-col>
    </el-row>
  </div>
</template>

<script>
  import oppoadd from "../../components/sales/OppoAdd.vue"
  import oppoedit from "../../components/sales/OppoEdit.vue"
  export default {
    components: {
      oppoadd, oppoedit
    },
    data() {
      return {
        oppoList: this.$store.state.oppoList,
        clientName: '',
        desc: '',
        person: '',
      }
    },
    methods: {
      find: function () {
        alert("查询")

      },
      delete: function (index, id) {
        alert("删除")
      },
    }
  }
</script>


<style></style>
