package xin.qhongchen.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import xin.qhongchen.crm.entity.SalesOpportunity;
import xin.qhongchen.crm.repository.SalesOppoRepository;
import xin.qhongchen.crm.service.SalesOppoService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   16:15
 */
@Service
public class SalesOppoServiceImpl implements SalesOppoService {

    @Autowired
    SalesOppoRepository salesOppoRepository ;

    @Override
    public List<SalesOpportunity> findAll() {

        return salesOppoRepository.findAll();
    }

    @Override
    public SalesOpportunity getById(Integer id) {

        return salesOppoRepository.findOne(id);
    }

    @Override
    public void updateOppo(SalesOpportunity oppo) {

        salesOppoRepository.save(oppo);

    }

    @Override
    public void deleteOppo(Integer id) {


        salesOppoRepository.delete(id);
    }

    @Override
    public SalesOpportunity saveOppo(SalesOpportunity oppo) {

        salesOppoRepository.save(oppo);

        return oppo;
    }

    @Override
    public List<SalesOpportunity> findByCondition(String clientName, String desc, String person) {
        if (clientName == null)
            clientName = "";
        if (desc == null)
            desc = "";
        if (person == null)
            person = "";

        return salesOppoRepository.findBySalesClientNameLikeAndSalesDescLikeAndSalesPersonLike(
                "%"+clientName+"%",
                "%"+desc+"%",
                "%"+person+"%");
    }
}
