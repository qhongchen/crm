import axios from 'axios'
axios.defaults.baseURL = 'http://localhost:8081';
//axios.defaults.headers.post['content-Type'] = 'application/x-www-form-urlencoded';

(function () {
  /**
   * sandBox文件
   * 把sandBox挂载到window下
   * 使sandBox成为一个全局变量
   */
  window.sandBox = {
    /**
     * get方法
     * 所有的get请求将调用该方法
     */
    get(obj){
      // todo ...
      axios.get(obj.api,{
        params: obj.params
      }).then(function (response) {
        // 请求成功

        obj.success && obj.success(response.data);
      }).catch(function (error) {
        // 显示错误提示信息
        // 这是系统级别的异常, 将null作为第一参数传入
        sandBox.error(null, error);
      });
    },

    /**
     * post方法
     * 所有的post请求将调用该方法
     */
    post(obj) {
      // todo ...

      console.log(obj)
      axios.post(obj.api, obj.data).then(function (response) {
        // 请求成功
        obj.success && obj.success(response.data);
      }).catch(function (error) {
        // 显示错误提示信息
        // 这是系统级别的异常, 将null作为第一参数传入
        sandBox.error(null, error);
      });
    },

    error(callback, err){
      // todo ...
      if (callback) {
        // 如果传入了自定义的错误提示信息, 那么就调用自定义的错误提示信息
        callback(err);
      } else {
        // 否则, 就显示系统基本的错误提示
        console.log(err);
      }
    }

  }
}());
