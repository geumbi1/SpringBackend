package com.example.Head03_OOP.example11;

public class MainTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();
    }
}
