package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {
    int min;
    List<Integer> stack;
    /** initialize data structure. */
    public MinStack() {
        this.min = Integer.MAX_VALUE;
        this.stack = new ArrayList();
    }
    /** Push element x onto stack*/
    public void push(int x) {
        if(x < min){
            min = x;
        }
        stack.add(x);
    }
    /** Removes the element on top of the stack*/
    public void pop() {
        if(stack.get(stack.size()-1) == min){
            min = Integer.MAX_VALUE;
            for(int i = 0; i < stack.size() - 1; i++){
                min = Math.min(min, stack.get(i));
            }
        }
        stack.remove(stack.size()-1);

    }
    /** Removes the element on top of the stack*/
    public int top() {
        return stack.get(stack.size()-1);
    }

    /** Retrieve the minimum element in the stack*/
    public int getMin() {
        if(stack.size() > 0){
            return min;
        }else{
            return Integer.MIN_VALUE;
        }
    }
}
