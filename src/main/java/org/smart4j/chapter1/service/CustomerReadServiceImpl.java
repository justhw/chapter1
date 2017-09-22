package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.model.dao.CustomerDao;

import io.terminus.common.model.PageInfo;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.boot.rpc.common.annotation.RpcProvider;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */
@Slf4j
@Service
@RpcProvider
public class CustomerReadServiceImpl implements CustomerReadService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Response<Customer> findById(Long id) {
        try{
            return Response.ok(customerDao.findById(id));
        }catch (Exception e){
            log.error("failed to find customer by id:{}, cause:{}", id, Throwables.getStackTraceAsString(e));
            return Response.fail("customer.find.fail");
        }
    }

    @Override
    public Response<Paging<Customer>> paging(Integer pageNo, Integer pageSize, Map<String, Object> criteria) {
        try{
            PageInfo pageInfo = new PageInfo(pageNo, pageSize);
            return Response.ok(customerDao.paging(pageInfo.getOffset(), pageInfo.getLimit(), criteria));
        }catch (Exception e){
            log.error("failed to paging customer by pageNo:{} pageSize:{}, cause:{}", pageNo, pageSize, Throwables.getStackTraceAsString(e));
            return Response.fail("customer.paging.fail");
        }
    }

    @Override
    public Response<List<Customer>> list(Map<String, Object> criteria) {
        try{
            return Response.ok(customerDao.list(criteria));
        }catch (Exception e){
            log.error("failed to list customer, cause:{}", Throwables.getStackTraceAsString(e));
            return Response.fail("customer.list.fail");
        }
    }

}
