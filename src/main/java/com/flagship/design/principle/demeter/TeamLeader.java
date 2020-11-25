package com.flagship.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TeamLeader
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:41
 */
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是" + courseList.size());
    }
}
