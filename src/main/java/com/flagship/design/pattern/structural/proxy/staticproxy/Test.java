package com.flagship.design.pattern.structural.proxy.staticproxy;

import com.flagship.design.pattern.structural.proxy.Order;

/**
 * @Author Flagship
 * @Date 2020/11/17 21:13
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
