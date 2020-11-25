package com.flagship.design.principle.compositionnaggregation;

/**
 * @ClassName: PostgreSQLConnection
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/31 0:05
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
