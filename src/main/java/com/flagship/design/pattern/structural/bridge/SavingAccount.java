package com.flagship.design.pattern.structural.bridge;

/**
 * @Author Flagship
 * @Date 2020/11/17 19:11
 * @Description
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
