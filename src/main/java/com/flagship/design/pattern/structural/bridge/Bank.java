package com.flagship.design.pattern.structural.bridge;

/**
 * @Author Flagship
 * @Date 2020/11/17 19:14
 * @Description
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
