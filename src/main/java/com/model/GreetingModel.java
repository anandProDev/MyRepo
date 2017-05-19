package com.model;

public class GreetingModel {
    private long id;
    private String content;

    public GreetingModel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
