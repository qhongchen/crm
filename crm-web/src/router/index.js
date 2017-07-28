import Vue from 'vue'
import Router from 'vue-router'
import Login from '../pages/Login.vue'
import Main from '../pages/Main.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/main',
      name: 'Main',
      component: Main,
      children : [
        {
          path : '',
          // 懒加载
          component : resolve => require(['../components/Hello.vue'],resolve),
        },
        {
          path : 'oppo_list',
          // 懒加载
          component : resolve => require(['../pages/sales/OppoList.vue'],resolve),
        },
      ]
    }
  ],

})
