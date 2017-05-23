package com.model;


public class GreetingModel {
    private long id;
    private String content;

    private GreetingModel(long id, String content) {

        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public static class GreetingModelBuilder {

        private long id;
        private String content;

        public GreetingModelBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public GreetingModelBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public GreetingModel build() {
            return new GreetingModel(id, content);
        }


    }
}
