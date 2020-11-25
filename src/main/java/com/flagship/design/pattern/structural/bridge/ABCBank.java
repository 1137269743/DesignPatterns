package com.flagship.design.pattern.structural.bridge;

/**
 * @Author Flagship
 * @Date 2020/11/17 20:05
 * @Description
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账户");
        account.openAccount();
        return account;
    }
}
