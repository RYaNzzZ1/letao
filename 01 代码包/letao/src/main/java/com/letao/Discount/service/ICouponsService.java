package com.letao.Discount.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Discount.entity.Coupons;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface ICouponsService extends IService<Coupons> {

    //获取失效优惠券ids
    List<Long> getExpiredCoupons();
}
