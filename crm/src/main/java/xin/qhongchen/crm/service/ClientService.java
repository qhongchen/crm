package xin.qhongchen.crm.service;

import org.springframework.transaction.annotation.Transactional;
import xin.qhongchen.crm.entity.Client;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   15:36
 */
@Transactional
public interface ClientService {

    List<Client> findAll();
}
