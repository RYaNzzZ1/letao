package com.letao.Order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.Customer.entity.ShoppingCart;
import com.letao.Order.entity.OrderDetail;
import com.letao.Order.entity.Orders;

import java.util.List;

/**
 * <p>
 * 订单明细表 服务类
 * </p>
 */
public interface IOrderDetailService extends IService<OrderDetail> {

    //将订单明细返还购物车
    List<ShoppingCart> ordersTransferToShoppingCart(List<Orders> timeoutOrders);

    //根据订单id查明细
    List<OrderDetail> listByOrderId(Long orderId);

    //清除订单明细
    void removeOrderDetails(List<Orders> timeoutOrders);
}
