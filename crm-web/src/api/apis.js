/**
 * API服务
 */
(function (sb) {
  sb.APIs = {
    // 在这里封装所有API调用方法

    oppo: {

      get: function(obj) {
        // 将这个方法对应的API名称赋值给obj.api
        obj.api = "getOppo";
        sb.get(obj);
      },

      list : function (obj) {
        obj.api = "oppoList";
        sb.get(obj);
      },

      add : function (obj) {
        obj.api = "addOppo";
        sb.post(obj);
      },

      updata : function (obj) {
        obj.api = "updateOppo";
        sb.post(obj);
      },
      search : function (obj) {
        obj.api = "searchOppo";
        sb.get(obj);
      },
      delete : function (obj) {
        obj.api = "deleteOppo";
        sb.get(obj);
      },
    },

    user : {
      login : function (obj) {
        obj.api = "login";
        sb.post(obj);
      },

      list : function (obj) {
        obj.api = "/user/getListByPower";
        sb.get(obj);
      }

    }
  }
}(window.sandBox));
