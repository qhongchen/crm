<template>
  <el-row>
    <el-col :span="6" :offset="9">
      <el-form :model="userInfo" :rules="rules2"  label-position="left" label-width="0px">
        <h3 class="title">系统登录</h3>
        <el-form-item prop="userName">
          <el-input type="text" v-model="userInfo.userName" auto-complete="off" placeholder="账号"></el-input>
        </el-form-item>
        <el-form-item prop="userPwd">
          <el-input type="password" v-model="userInfo.userPwd" auto-complete="off" placeholder="密码"></el-input>
        </el-form-item>
        <el-checkbox v-model="checked" checked class="remember">记住密码</el-checkbox>
        <el-form-item style="width:100%;">
          <el-button type="primary" style="width:100%;" :loading="logining" @click="login">登录</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</template>

<script>
  import ElementUI from 'element-ui'
  import ElRow from "element-ui/packages/row/src/row";
  import ElCol from "element-ui/packages/col/src/col";
  import jq from  "../js/jquery-1.4.4.min"
  export default {
    components: {
      ElCol, ElRow, ElementUI, jq
    },
    data() {
      return {
        logining: false,
        userInfo: {
          userName: '',
          userPwd: ''
        },
        rules2: {
          userName: [
            {required: true, message: '请输入账号', trigger: 'blur'},
            //{ validator: validaePass }
          ],
          userPwd: [
            {required: true, message: '请输入密码', trigger: 'blur'},
            //{ validator: validaePass2 }
          ]
        },
        checked: true
      };
    },
    methods: {
      login: function () {

        this.logining = true;

        $.ajax({
          url: 'http://localhost:8081/login',
          data: this.userInfo,
          method: 'POST',
          headers: {
            'Content-type': 'application/x-www-form-urlencoded'
          }, success: function (data) {

              setTimeout(function () {
                if (data) {
                  this.$message({
                    message: "登录成功",
                    type: 'success'
                  });
                  this.$router.push("/main")
                  sessionStorage.loginedUser =  JSON.stringify(data)
                  this.$store.state.user = data
                } else {
                  this.$message({
                    message: "账号或密码不正确",
                    type: 'error'
                  });
                }

                this.logining = false;
              }.bind(this),500)

          }.bind(this)

        });
      }
    }
  }

</script>

