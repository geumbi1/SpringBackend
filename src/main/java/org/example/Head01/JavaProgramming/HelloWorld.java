package org.example.Head01.JavaProgramming;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        int b = a;  // b는 10을 복사해서 가진다.

        b = 20;
        System.out.println(a); // 출력: 10 (영향 없음)
    }
}

