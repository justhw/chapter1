package org.smart4j.chapter1.service;

import org.smart4j.chapter1.model.Customer;

import io.terminus.common.model.Response;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */
public interface CustomerWriteService {

    /**
     * 创建
     * @param customer
     * @return Boolean
     */
    Response<Long> create(Customer customer);

    /**
     * 更新
     * @param customer
     * @return Boolean
     */
    Response<Boolean> update(Customer customer);

    /**
     * 删除
     * @param id
     * @return Boolean
     */
    Response<Boolean> delete(Long id);

}