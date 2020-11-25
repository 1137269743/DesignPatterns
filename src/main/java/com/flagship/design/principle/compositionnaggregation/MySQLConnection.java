package com.flagship.design.principle.compositionnaggregation;

/**
 * @ClassName: MySQLConnection
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:04
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
