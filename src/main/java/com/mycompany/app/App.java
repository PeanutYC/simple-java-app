package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "running Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("new change to demo webhook");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
