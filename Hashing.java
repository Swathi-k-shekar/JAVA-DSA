package com.company;

import java.util.HashMap;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        //Hash Maps
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Swa",21);
        hm.put("Aks",4556);
        hm.put("Sham",4);
        System.out.println(hm.containsKey("sded"));
        System.out.println(hm.get("Sham"));
        System.out.println(hm);
        hm.remove("Swa");
        System.out.println(hm);
//        hm.clear();
//        hm.isEmpty()
        System.out.println(hm.size());

        //itriation of hash map
        Set<String> obj=hm.keySet(); //entryset
        System.out.println(obj);

        for (String  st:obj) {
            System.out.println("key ="+ "  "+st+"   "+"VALUE ="+" "+ hm.get(st));
        }

        
    }
}
