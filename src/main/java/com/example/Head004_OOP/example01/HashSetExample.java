package com.example.Head004_OOP.example01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        System.out.println("Contins 'Japan ' ? " + countries.contains("Japan"));

        countries.remove("China");
        System.out.println("After remove 'China': " + countries);

        System.out.println("Set Size: " + countries.size());
        countries.clear();
        System.out.println("After clear: " + countries);
    }
}
