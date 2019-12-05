package com.example;

public class Main {
    /**Test the MinStack. */
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(40);
        obj.push(10);
        obj.push(19);
        obj.push(1);
        obj.push(8);
        System.out.println("Top Element: " + obj.top());
        obj.pop();
        System.out.println("Top Element: " + obj.top());
        System.out.println("Min Element: " + obj.getMin());
        obj.pop();
        System.out.println("Min Element: " + obj.getMin());
    }
}
