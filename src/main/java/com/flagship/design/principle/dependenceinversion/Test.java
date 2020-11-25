package com.flagship.design.principle.dependenceinversion;

/**
 * @ClassName: Test
 * @Author: Flagship
 * @Description:
 * @Date: 2020/10/29 22:50
 */
public class Test {
    public static void main(String[] args) {
          //1、接口方法注入
//        Flagship flagship = new Flagship();
//        flagship.studyImoocCourse(new JavaCourse());
//        flagship.studyImoocCourse(new FECourse());
//        flagship.studyImoocCourse(new PythonCourse());

//        //2、构造器注入
//        Flagship flagship = new Flagship(new JavaCourse());
//        flagship.studyImoocCourse();

        //3、Set方法注入
        Flagship flagship = new Flagship();
        flagship.setiCourse(new JavaCourse());
        flagship.studyImoocCourse();
        flagship.setiCourse(new FECourse());
        flagship.studyImoocCourse();
    }
}
