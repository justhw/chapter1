package org.smart4j.chapter1.controller;

import org.smart4j.chapter1.model.Customer;
import org.smart4j.framework.CustomerService;
import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.Param;
import org.smart4j.framework.bean.View;

import java.util.List;

/**
 * Author： caoshengsheng
 * Date： 2017/9/27
 */
@Controller
public class Students {

    @Inject
    private CustomerService customerService;

    @Action(value = "/student",method = "get")
    public View index(Param param){
        List<Customer> customerList = customerService.getCustomerList("keyword");
        return new View("custom.jsp").addModel("customerList",customerList);
    }
}
