package com.flagship.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * @Author Flagship
 * @Date 2020/11/22 17:45
 * @Description
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准");
            return;
        }
    }
}
