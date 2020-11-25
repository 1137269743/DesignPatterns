package com.flagship.design.pattern.structural.flyweight;

/**
 * @Author Flagship
 * @Date 2020/11/16 21:06
 * @Description
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
