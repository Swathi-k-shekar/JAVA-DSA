package com.company.QueeIMplemtion;

import java.util.ArrayList;

public class Queeeee {
    public static void enque(ArrayList<Integer> stk, int ar) {
        stk.add(ar);
    }


    public static void display(ArrayList<Integer> stk) {
        if(stk.size()==0) System.out.println("No elements");
        System.out.println(stk.toString());
    }



}
