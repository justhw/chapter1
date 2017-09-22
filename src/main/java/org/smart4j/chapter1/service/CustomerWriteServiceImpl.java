package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.model.dao.CustomerDao;

import io.terminus.common.model.Response;
import io.terminus.boot.rpc.common.annotation.RpcProvider;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */
@Slf4j
@Service
@RpcProvider
public class CustomerWriteServiceImpl implements CustomerWriteService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Response<Long> create(Customer customer) {
        try{
            customerDao.create(customer);
            return Response.ok(customer.getId());
        }catch (Exception e){
            log.error("failed to create customer, cause:{}", Throwables.getStackTraceAsString(e));
            return Response.fail("customer.create.fail");
        }
    }

    @Override
    public Response<Boolean> update(Customer customer) {
        try{
            return Response.ok(customerDao.update(customer));
        }catch (Exception e){
            log.error("failed to update customer, cause:{}", Throwables.getStackTraceAsString(e));
            return Response.fail("customer.update.fail");
        }
    }

   @Override
    public Response<Boolean> delete(Long id) {
        try{
            return Response.ok(customerDao.delete(id));
        }catch (Exception e){
            log.error("failed to delete customer by id:{}, cause:{}", id,  Throwables.getStackTraceAsString(e));
            return Response.fail("customer.delete.fail");
        }
    }

}