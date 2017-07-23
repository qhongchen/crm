package xin.qhongchen.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import xin.qhongchen.crm.entity.SalesOpportunity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   16:13
 */
public interface SalesOppoRepository extends JpaRepository<SalesOpportunity,Integer>,JpaSpecificationExecutor<SalesOpportunity> {

    @Query("select o from SalesOpportunity o where o.salesClientName like ?1")
    List<SalesOpportunity> findByConditions(String name);

    List<SalesOpportunity> findBySalesClientNameLikeAndSalesDescLikeAndSalesPersonLike(String clientName, String desc, String person);
}