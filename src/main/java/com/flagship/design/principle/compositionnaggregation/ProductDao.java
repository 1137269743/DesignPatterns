package com.flagship.design.principle.compositionnaggregation;

/**
 * @ClassName: ProductDao
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/30 23:58
 */
public class ProductDao{
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "添加产品");
    }
}
