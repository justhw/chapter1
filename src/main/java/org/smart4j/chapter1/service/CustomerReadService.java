package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;

import java.util.Map;
import java.util.List;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */
public interface CustomerReadService {

    /**
     * 查询
     * @param id
     * @return customer
     */
    Response<Customer> findById(Long id);

    /**
     * 分页
     * @param pageNo
     * @param pageSize
     * @param criteria
     * @return Paging<Customer>
     */
    Response<Paging<Customer>> paging(Integer pageNo, Integer pageSize, Map<String, Object> criteria);

   /**
    * 列表
    * @param criteria
    * @return List<Customer>
    */
    Response<List<Customer>> list(Map<String, Object> criteria);
}