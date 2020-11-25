package com.flagship.design.principle.singleresponsibility;

/**
 * @ClassName: Method
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:22
 */
public class Method {
    private void updateUserInfo(String username, String... properties){
        username = "flagship";
    }

    private void updateUserName(String username){
        username = "flagship";
    }

    private void updateUserAddress(String address){
        address = "guangdong";
    }

    private void updateUserInfo(String username, String address, boolean bool){
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        username = "flagship";
        address = "guangdong";
    }
}
