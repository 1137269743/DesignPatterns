package com.flagship.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Boss
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 23:40
 */
public class Boss {
    public void commandCheckNumber (TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
