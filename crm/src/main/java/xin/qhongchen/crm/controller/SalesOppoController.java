package xin.qhongchen.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.crm.entity.SalesOpportunity;
import xin.qhongchen.crm.service.SalesOppoService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   16:16
 */
@RestController
public class SalesOppoController {

    @Autowired
    SalesOppoService service;

    @RequestMapping("/oppoList")
    public List<SalesOpportunity> findAll() {

        return service.findAll();
    }

    @RequestMapping("/searchOppo")
    public List<SalesOpportunity> findByCondition(String clientName,String desc,String person) {

        return service.findByCondition(clientName,desc,person);
    }

    @RequestMapping("/getOppo")
    public SalesOpportunity getOppoById(Integer id) {

        return service.getById(id);
    }

    @RequestMapping("/updateOppo")
    public SalesOpportunity updateOppo(SalesOpportunity oppo) {


        service.updateOppo(oppo);

        return service.getById(oppo.getSalesId());
    }

    @RequestMapping("/addOppo")
    public SalesOpportunity addOppo(SalesOpportunity oppo){

        service.saveOppo(oppo);

        return oppo;
    }

    @RequestMapping("/deleteOppo")
    public Integer deleteOppo(Integer id,Integer index){

        service.deleteOppo(id);

        return index;
    }

}
