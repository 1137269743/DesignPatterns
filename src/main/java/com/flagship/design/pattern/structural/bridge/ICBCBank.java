package com.flagship.design.pattern.structural.bridge;

/**
 * @Author Flagship
 * @Date 2020/11/17 20:07
 * @Description
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账户");
        account.openAccount();
        return account;
    }
}
