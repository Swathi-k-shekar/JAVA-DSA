package com.company;

public class Aryoprations {
    static void printSubAry(int[] a){
        int n=a.length;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int sum=0;
            for (int j = i+1; j <n ; j++) {
//                int end=j;
                sum=0;
                for (int k = i; k < j ; k++) {
                    sum=sum+a[k];
                    System.out.print(a[k]+",");
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
                System.out.print(" "+"   sum="+sum +"   ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
    static  void maxSumAry(int[] a){
        int n= a.length;
        int[] a1=new int[n];
        int[] a2=new int[n];
        a1[0]=a[0];
        for (int j =1; j < n; j++) {
            a1[j]=a1[j-1]+a[j];
        }
        printing(a1);
        for (int i = 0 ; i <n; i++) {

            for (int j=i; j<n ; j++) {
                if(i<0) a2[i]=a1[i];
                a2[i]=i==0?a1[j]:a1[j]-a1[i-1];
            }
        }
        printing(a2);

    }
    static void printing(int[] b){
        System.out.println();
        System.out.print("[");
        for (int i: b) {
            System.out.print(i+" ");
        }
        System.out.println("]");
    }
    public static void rainTrap(int[] a){
        int max=Integer.MIN_VALUE;
        int n=a.length;
        int[] lb=new int[n];
        int[] rb=new int[n];
        int trap=0;
        //traped water=(waterlevel -heighgt)*width
        //water level=min(max left,maxright)
        lb[0]=a[0];
        rb[n-1]=a[n-1];
        //left max boundry
        for (int i = 1; i < n; i++) {
            lb[i]=Math.max(a[i],lb[i-1]);
        }
        // right maxboundray
        for (int i = n-2; i >=0; i--) {
            rb[i]=Math.max(a[i],rb[i+1]);
        }
        for (int i:
                lb) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i:
                rb) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int width=1;
            trap=trap+(Math.min(rb[i],lb[i])-a[i]) * width;

        }
        System.out.println(trap);
    }
    static int minum(int a,int b)
    {
        int min=a<b?a:b;
        return min;
    }
    static int[] maxum(int[] b) {
        return b;
    }
    // buy and selling of stocks
    public static void stocksellBuy(int[] p){
        int buyPrice=Integer.MAX_VALUE;
        int maxprof=0;
        for (int i = 0; i <p.length ; i++) {
            if(buyPrice < p[i]) {
                int prof=p[i]-buyPrice;
                maxprof=Math.max(prof,maxprof);
            }
            else {
                buyPrice=p[i];
            }
        }
        System.out.println(maxprof);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4};
//        printSubAry(arr);
//        maxSumAry(arr);
//        rainTrap(arr);
        stocksellBuy(arr);
    }
}
