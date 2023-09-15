package com.company.QueeIMplemtion;

import java.util.ArrayList;

public class SingleEndQue {
    public static void dequee(ArrayList<Integer> stk) {
        if(stk.size()==0) System.out.println("No elements");

        stk.remove(0);

    }

    public static void main(String[] args) {
        ArrayList<Integer> stck=new ArrayList<Integer>();
        Queeeee.enque(stck,23);
        Queeeee.enque(stck,24);
        Queeeee.enque(stck,25);
        Queeeee.enque(stck,26);
        Queeeee.enque(stck,27);
        Queeeee.enque(stck,28);
        Queeeee.enque(stck,29);
        Queeeee.enque(stck,30);

        Queeeee.display(stck);
        dequee(stck);
        Queeeee.display(stck);

    }
}
