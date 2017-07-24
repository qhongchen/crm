import * as types from './mutation-types'

export default {
  // 新增销售机会
  [types.SAVE_OPPO] (state, oppo) {
    state.oppoList.push(oppo)
  },
  // 删除某销售机会
  [types.DELETE_OPPO] (state, idx) {
    state.oppoList.splice(idx, 1);
  },

  // 更新oppolist的数据
  [types.UPDATE_OPPOLISTDATA] (state, list) {
    state.oppoList.splice(0,state.oppoList.length);
    for (var i = 0 ;i < list.length ; i++)
      state.oppoList.push(list[i])
  },

  // 删除某销售机会
  [types.UPDATE_OPPO] (state, oppo) {
    for (var i = 0 ;i < state.oppoList.length ; i++)
      if ( oppo.salesId == state.oppoList[i].salesId){
        console.log(state.oppoList[i].salesId);
          state.oppoList.splice(i,1,oppo);
      }

  },

  [types.CHANGE_ID] (state, id) {
    state.id = id
  }
};
