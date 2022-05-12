package com.springdemo.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("crouch");
    }

    public void left() {
        System.out.println("move left");
    }

    public void right() {
        System.out.println("move right");
    }
}
