package com.letao.Commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Commodity.entity.CommodityAttribute;

import java.util.List;

/**
 * <p>
 * 菜品口味关系表 服务类
 * </p>
 */
public interface ICommodityAttributeService extends IService<CommodityAttribute> {
    boolean deleteCommodityByCommodityId(Long commodityId);

    List<CommodityAttribute> getAttribute(long commodityId);

}
