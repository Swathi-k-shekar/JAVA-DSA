package com.company.Algorithims;

public class mergesort {
    public static void conqure(int[] a,int si,int mid,int ei){
        int merge[]=new int[ei-si+1];

        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(a[idx1]<=a[idx2]){
                merge[x]=a[idx1];
                x++;
                idx1++;
            }
            else{
                merge[x++]=a[idx2++];
            }
        }
        while(idx1 <= mid){
            merge[x++]=a[idx1++];
        }
        while(idx2 <= ei){
            merge[x++]=a[idx2++];
        }
        for(int i=0,j=0;i< merge.length;i++,j++){
            a[j++]=merge[i++];
        }
    }
    public static void merge_sort(int[] a,int si,int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;

            merge_sort(a, si, mid);
            merge_sort(a, mid + 1, ei);
            conqure(a, si, mid, ei);
        }
    }
    public static void main (String args[]){
        int[] arr=new int[]{23,45,67,2,1,34};
        merge_sort(arr,0, arr.length-1);
        System.out.println("Merge sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
