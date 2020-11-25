package com.flagship.design.pattern.structural.proxy;

/**
 * @Author Flagship
 * @Date 2020/11/17 20:49
 * @Description
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
