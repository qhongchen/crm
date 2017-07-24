<template>
  <div>
    <el-button @click="dialogFormVisible = true" size="small">编辑</el-button>

    <el-dialog title="销售机会管理 > 修改销售机会" :visible.sync="dialogFormVisible">
      <el-form v-model="oppo">
        <el-form-item align="center">
          <el-col span="3" offset="2">编号:</el-col>
          <el-col span="6">
            <el-input auto-complete="off" disabled v-model="oppo.salesId"></el-input>
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
        <el-button @click=" test()">取 消</el-button>
        <el-button type="primary" @click=" save()">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  import ElCol from "element-ui/packages/col/src/col";
  import ElRow from "element-ui/packages/row/src/row";
  import ElInput from "../../../node_modules/element-ui/packages/input/src/input";
  import js from  "../../js/jquery-1.4.4.min"
  export default {
    components: {
      ElInput,
      ElRow,
      ElCol,
      js
    },
    props: {
      id: Number,
    },
    mounted: function () {

      this.$http.get('http://localhost:8081/getOppo', {
        params: {
          id: this.id
        }
      })
        .then(function (res) {
          this.oppo = res.data
        }.bind(this))
        .catch(function (err) {
          console.log(err);
        });

    },
    data() {
      return {
        dialogFormVisible: false,
        formLabelWidth: '60px',
        oppo: null,
      };
    },
    methods: {
      save() {

        $.ajax({
          url: 'http://localhost:8081/updateOppo',
          data: this.oppo,
          type: "POST",
          headers: {
            'Content-type': 'application/x-www-form-urlencoded'
          },
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
      test(){
        this.$message('取消编辑');
        this.$store.state.id = this.id;
        this.oppo = this.$store.getters.getOppoByid[0]

        this.dialogFormVisible = false
      }
    }
  };
</script>


<style></style>
