package com.flagship.design.pattern.structural.bridge;

/**
 * @Author Flagship
 * @Date 2020/11/17 19:11
 * @Description
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
