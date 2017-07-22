import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Main from  '../pages/Main.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Main',
      component: Main,
      children:[
        {
        path : '',
        // 懒加载
        component : resolve => require(['../components/Hello.vue'],resolve),
      },
      ]
    }
  ]
})
