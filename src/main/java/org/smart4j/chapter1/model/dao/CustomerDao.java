package org.smart4j.chapter1.model.dao;

import org.smart4j.chapter1.model.Customer;
import io.terminus.common.mysql.dao.MyBatisDao;

import org.springframework.stereotype.Repository;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */
@Repository
public class CustomerDao extends MyBatisDao<Customer> {

}
