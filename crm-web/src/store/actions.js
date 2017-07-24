import * as types from './mutation-types'

export default {
  saveOppo({ commit }, oppo) {
    commit(types.SAVE_OPPO, oppo);
  },
  deleteOppo({ commit }, idx) {
    commit(types.DELETE_OPPO, idx)
  },
  updateOppoList({ commit }, list) {
    commit(types.UPDATE_OPPOLISTDATA, list);
  },
  updateOppo({ commit }, oppo) {
    commit(types.UPDATE_OPPO, oppo);
  },
  changeId({ commit }, id) {
    console.log("actions------->"+id)
    commit(types.CHANGE_ID, id)
  }
};
