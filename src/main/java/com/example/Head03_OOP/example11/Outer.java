package com.example.Head03_OOP.example11;

public class Outer {
    private  int instanceValue = 200;

    public class Inner {
        public void printInstanceValue() {
            System.out.println("Outer.staticValue: " + instanceValue);
        }
    }
}
