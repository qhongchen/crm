import Vue from 'vue'
import Vuex from 'vuex'
import mutations from './mutations.js'
import actions from './actions'
Vue.use(Vuex);

const state = {
  oppoList: [],
  user : null,
  id : 1,
};

export default new Vuex.Store({
  state,
  actions,
  mutations,
  getters:{
    getOppoByid: state =>{
      return state.oppoList.filter(oppo => oppo.salesId == state.id)
    },
  }
})
