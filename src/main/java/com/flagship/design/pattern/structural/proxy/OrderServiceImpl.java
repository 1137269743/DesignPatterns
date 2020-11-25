package com.flagship.design.pattern.structural.proxy;

/**
 * @Author Flagship
 * @Date 2020/11/17 20:50
 * @Description
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，在这里就直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
