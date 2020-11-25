package com.flagship.design.pattern.behavioral.memento;

/**
 * @Author Flagship
 * @Date 2020/11/22 16:25
 * @Description
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }
}
