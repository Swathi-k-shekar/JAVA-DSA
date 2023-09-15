package com.company.AryList;
// colletions is a class and collection is a Interface use collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arylistopration {
    public static void pairsum(ArrayList<Integer> gs,int sum) {
//        gs.sort();
        int brp=0;
        int st=0;
        int en=gs.size()-1;
        for (int i = 0; i < gs.size()-1; i++) {
            if(gs.get(i) > gs.get(i+1)) {
                brp=i;
                break;
            }
        }

        //pair det
        st=brp+1 ;
        en=brp;
        int x=0,y=0;
        while (st != en){
            if((gs.get(st)+gs.get(en))==sum){
                x= gs.get(st);
                y= gs.get(en);
            }
            if((gs.get(st)+gs.get(en)) > sum){
                st=(st+1)%(gs.size()-1);

            }
            else{

//                st = st > (gs.size()-1)?0:st++;
//                en= en<0? gs.size()-1:en--;
                en=(gs.size()+en-1)%(gs.size()-1);

            }
        }
        System.out.println(x);
        System.out.println(y);

    }
    public static int  optimwater(ArrayList<Integer> rg) {
        int st=0;
        int str=0,end=rg.size()-1;
        while (end >str) {
            int h=Math.min(rg.get(str),rg.get(end));
            int w=end-str;
            st=Math.max(st,h*w);
            if(rg.get(str)<rg.get(end)) str=str+1;
            else end--;
        }
        return st;
    }
    public static int waterStore(ArrayList<Integer> rg) {
        int st=0;
        for (int i = 0; i < rg.size(); i++) {
            for (int j = i+1; j <rg.size() ; j++) {
                int hi=Math.min(rg.get(i),rg.get(j));
                int wd=j-i;
                int dif=hi*wd;
                st=Math.max(st,dif);
            }

        }
        return st;
    }

    public static void main(String[] args) {
       ArrayList<Integer> ary=new ArrayList<Integer>();

        ary.add(25);
       ary.add(12);
       ary.add(14);
       ary.add(5);
        System.out.println(ary.size());
        Iterator<Integer> itr= ary.iterator();
        while (itr.hasNext() ){
            System.out.print(itr.next()+" ");
        }
        Collections.sort(ary); //assending
        //second parameter is the comparator =which defins the logic
        Collections.sort(ary,Collections.reverseOrder());// desending
        System.out.println(ary);
//        System.out.println(ary.toArray());


        //Ary list of Ary list
        ArrayList<ArrayList<Integer>> mul=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(23);
        arr.add(34);
        arr.add(56);
        System.out.println(arr);
        mul.add(arr);
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(23);
        ar.add(34);
        ar.add(56);
        System.out.println(ar);
        mul.add(ar);
        System.out.println(mul);

        Iterator<ArrayList<Integer>> ir= mul.iterator();
        while (ir.hasNext() ){
            System.out.print(ir.next()+"    ");

        }
        ArrayList<Integer> wa=new ArrayList<Integer>();
        wa.add(4);
        wa.add(8);
        wa.add(6);
        wa.add(2);
        wa.add(5);
        wa.add(6);
        wa.add(3);
        wa.add(7);
        int water=waterStore(wa);
//        System.out.println(water);
//        System.out.println(optimwater(wa));
        ArrayList<Integer> w=new ArrayList<Integer>();
        wa.add(10);
        wa.add(11);
        wa.add(1);
        wa.add(2);
        wa.add(3);
        wa.add(4);
//        wa.add(5);
//        wa.add(7);
        pairsum(w,12);


    }


}
