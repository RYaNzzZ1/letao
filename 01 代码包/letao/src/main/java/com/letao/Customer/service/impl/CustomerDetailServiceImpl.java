package com.letao.Customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.letao.Customer.entity.CustomerDetail;
import com.letao.Customer.mapper.CustomerDetailMapper;
import com.letao.Customer.service.ICustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class CustomerDetailServiceImpl extends ServiceImpl<CustomerDetailMapper, CustomerDetail> implements ICustomerDetailService {
    @Autowired
    private CustomerDetailMapper customerDetailMapper;

    @Override
    public CustomerDetail getCustomerDetail(int customerId) {
        QueryWrapper<CustomerDetail> wrapper = new QueryWrapper<>();
        wrapper.eq("customer_id", customerId);
        return customerDetailMapper.selectOne(wrapper);
    }

    @Override
    public void addCustomerDetail(CustomerDetail customerDetail) {
        customerDetailMapper.insert(customerDetail);
    }
}
