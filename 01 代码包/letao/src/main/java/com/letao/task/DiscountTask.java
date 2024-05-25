package com.letao.task;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.letao.Discount.entity.DiscountDetail;
import com.letao.Discount.service.IDiscountDetailService;
import com.letao.Discount.service.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DiscountTask {

    @Autowired
    private IDiscountService discountService;

    @Autowired
    private IDiscountDetailService discountDetailService;

    @Scheduled(cron = "0 0 4 * * *") // 每天四点执行
    @Transactional
    public void remove() {
        //获取失效折扣ids
        List<Long> discountIds = discountService.getExpiredDiscounts();

        if (discountIds.isEmpty()) return;

        //删除商品与失效折扣的关联
        LambdaQueryWrapper<DiscountDetail> wrapper = new LambdaQueryWrapper<>();
        wrapper.in(DiscountDetail::getDiscountId, discountIds);
        discountDetailService.remove(wrapper);
    }
}
