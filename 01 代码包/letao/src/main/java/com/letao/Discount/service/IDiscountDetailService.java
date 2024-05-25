package com.letao.Discount.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Discount.entity.DiscountDetail;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface IDiscountDetailService extends IService<DiscountDetail> {

    //获取参与折扣的所有商品id
    List<Long> allCommodityIdsWithDiscount();
}
