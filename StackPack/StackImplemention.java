package com.company.StackPack;

import java.util.ArrayList;

// can be implemented using list or Arraylist
public class StackImplemention {

    public static void push(ArrayList<Integer> stk,int ar) {
        stk.add(ar);
    }
    public static void pop(ArrayList<Integer> stk,int ar) {
        if(stk.size()==0) System.out.println("No elements");
        if(!stk.contains(ar)) System.out.println("Element not found");
        for (int i = 0; i < stk.size(); i++) {
            if (stk.get(i)==ar) {
                stk.remove(i);
            }
        }

    }

    public static void display(ArrayList<Integer> stk) {
        if(stk.size()==0) System.out.println("No elements");
        System.out.println(stk.toString());
    }


    public static void main(String[] args) {
        ArrayList<Integer> stck=new ArrayList<Integer>();
        push(stck,23);
        push(stck,24);
        push(stck,25);
        push(stck,26);
        push(stck,27);
        push(stck,28);
        push(stck,29);
        push(stck,20);
        display(stck);
        pop(stck,330);
        display(stck);


    }

}
