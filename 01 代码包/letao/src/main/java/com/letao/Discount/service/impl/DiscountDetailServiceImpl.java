package com.letao.Discount.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.letao.Discount.entity.DiscountDetail;
import com.letao.Discount.mapper.DiscountDetailMapper;
import com.letao.Discount.service.IDiscountDetailService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class DiscountDetailServiceImpl extends ServiceImpl<DiscountDetailMapper, DiscountDetail> implements IDiscountDetailService {

    //获取参与折扣的所有商品id
    @Override
    public List<Long> allCommodityIdsWithDiscount() {
        List<DiscountDetail> discountDetailList = this.list();
        List<Long> ids = new ArrayList<>();
        for (DiscountDetail discountDetail : discountDetailList) {
            ids.add(discountDetail.getCommodityId());
        }
        return ids;
    }
}
