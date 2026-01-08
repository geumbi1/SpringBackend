package com.example.Head004_OOP.example02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park",95);
        System.out.println("After put: " + scores);

        scores.put("Lee", 88);
        System.out.println("After updating 'Lee': " + scores);

        int parkScore = scores.get("Park");
        System.out.println("Park's score: " + parkScore);

        System.out.println("Contains 'Kim' ? " + scores.containsKey("Kim"));

        scores.remove("Kim");
        System.out.println("After remove 김: " + scores);

        System.out.println("all keys : " + scores.keySet());
    }
}
