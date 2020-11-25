package com.flagship.design.pattern.behavioral.chainofresponsibility;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:40
 * @Description
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
