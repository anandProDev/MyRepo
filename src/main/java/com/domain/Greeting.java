package com.domain;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


    public static class GreetingBuilder {
        private long id;
        private String content;

        public GreetingBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public GreetingBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Greeting build() {
            return new Greeting(id, content);
        }
    }
}