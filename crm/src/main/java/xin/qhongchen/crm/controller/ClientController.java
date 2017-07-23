package xin.qhongchen.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.qhongchen.crm.entity.Client;
import xin.qhongchen.crm.service.ClientService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   16:08
 */
@RestController
public class ClientController {

    @Autowired
    ClientService service;

    @RequestMapping("/clientList")
    public List<Client> findAll(){

        return service.findAll();

    }
}
