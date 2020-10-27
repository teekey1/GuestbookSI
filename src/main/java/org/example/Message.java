package org.example;

public class Message {

    private String name;
    private String text;
    private String date;

    public Message(String name, String text, String date) {
        this.name = name;
        this.text = text;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }
}
