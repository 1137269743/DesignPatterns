package com.flagship.design.pattern.behavioral.templatemethod;

/**
 * @Author Flagship
 * @Date 2020/11/22 13:07
 * @Description
 */
public abstract class ACourse {
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
