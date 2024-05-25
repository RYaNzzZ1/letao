package com.letao.Customer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Customer.entity.CustomerDetail;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface ICustomerDetailService extends IService<CustomerDetail> {
    /*
    admin调用，显示用户详情
     */
    CustomerDetail getCustomerDetail(int customerId);

    void addCustomerDetail(CustomerDetail customerDetail);
}
