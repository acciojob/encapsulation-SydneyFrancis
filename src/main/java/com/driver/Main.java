package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.name = "Sasi";
        obj.setName("Soman");
        System.out.println(obj.getName());;
    }
}