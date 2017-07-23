package xin.qhongchen.crm.service;

import org.springframework.transaction.annotation.Transactional;
import xin.qhongchen.crm.entity.SalesOpportunity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   16:14
 */
@Transactional
public interface SalesOppoService {

    List<SalesOpportunity> findAll();
    SalesOpportunity getById(Integer id);
    void updateOppo(SalesOpportunity oppo);
    void deleteOppo(Integer id);
    SalesOpportunity saveOppo(SalesOpportunity oppo);
    List<SalesOpportunity> findByCondition(String clientName,String desc,String person);

}
