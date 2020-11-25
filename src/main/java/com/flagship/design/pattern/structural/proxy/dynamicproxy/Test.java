package com.flagship.design.pattern.structural.proxy.dynamicproxy;

import com.flagship.design.pattern.structural.proxy.IOrderService;
import com.flagship.design.pattern.structural.proxy.Order;
import com.flagship.design.pattern.structural.proxy.OrderServiceImpl;
import com.flagship.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @Author Flagship
 * @Date 2020/11/17 21:35
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
