package com.flagship.design.pattern.creational.singleton;

/**
 * @ClassName: EnumInstance
 * @Author: Flagship
 * @Description:
 * @Date: 2020/11/1 15:03
 */
public enum  EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("Flagship Print Test");
        }
    };//用jad反编译源码发现，实际上INSTANCE在初始化类的时候就创建了
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
