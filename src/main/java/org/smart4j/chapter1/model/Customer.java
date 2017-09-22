package org.smart4j.chapter1.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Desc:
 * Mail: caoshengsheng@terminus.io
 * Date: 2017-09-20 14:13:30
 * Created by caoss
 */

@Data
public class Customer implements Serializable {

    private static final long serialVersionUID = 9116939774800442400L;

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

}