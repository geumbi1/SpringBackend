package com.example.Head03_OOP.example12;

interface MyCalculator {
    int operate(int x, int y);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };
        System.out.println("익명 클래스: 3 + 5 = " + addAnon.operate(3,5));
        //람다식 방식
        MyCalculator addLamda = (x,y) ->x + y;
        System.out.println("람다: 3 + 5 = " + addLamda.operate(3, 5));
    }
}
