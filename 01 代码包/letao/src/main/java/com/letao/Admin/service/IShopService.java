package com.letao.Admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Admin.entity.Shop;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface IShopService extends IService<Shop> {
    Shop getShop();

    int changeShop(Shop shop);
}
