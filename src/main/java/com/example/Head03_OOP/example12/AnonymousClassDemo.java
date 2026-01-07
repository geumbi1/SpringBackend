package com.example.Head03_OOP.example12;



public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask customTask = new AbstractTask() {
            public void start() {
                System.out.println("task 시작 변경");
            }

            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }
        };
        customTask.start();
        customTask.execute();
    }
}
