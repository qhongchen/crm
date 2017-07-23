package xin.qhongchen.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.qhongchen.crm.entity.Client;

/**
 * Created by IntelliJ IDEA.
 * Author: qhong Chen
 * Date:   2017/7/18
 * Time:   15:35
 */
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
