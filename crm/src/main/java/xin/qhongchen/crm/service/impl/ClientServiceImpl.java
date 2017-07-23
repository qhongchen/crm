package xin.qhongchen.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.qhongchen.crm.entity.Client;
import xin.qhongchen.crm.repository.ClientRepository;
import xin.qhongchen.crm.service.ClientService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   15:37
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository ;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
