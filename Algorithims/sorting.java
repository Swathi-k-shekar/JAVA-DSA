package com.company.Algorithims;

 class sorting {
//     printing arry
     void Print(int[] arr)
     {
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
         }
     }
    //      bubble sort
     void bubble_sort(int[] a) {
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = 0; j < a.length -1- i ; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
         System.out.println("Bubble sort");
        Print(a);
    }

    //selction sort
     void selection_sort(int[] a) {
        for (int i = 0; i < a.length-1 ; i++) {
            int small = a[i];
            for (int j = i + 1; j < a.length-1; j++) {
                if (small > a[j]) {
                    small = a[j];
                }
                int temp = small;
                small = a[j];
                a[j] = small;
            }
        }
         System.out.println("selection sort");
        Print(a);
    }

    void insertion_sort(int[] a) {
        for (int i = 1; i < a.length-1 ; i++) {
            int curr = a[i];
            int j = i - 1;
            while (curr < a[j] && j >= 0)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1]=curr;
        }
        System.out.println("Insertion sort");
        Print(a);
    }
    int partition(int[] a,int low,int high){
         int i=low-1;
         int pivot=a[high];
        for (int j = 0; j < high; j++) {
             if(a[j]<pivot){
                 i++;
                 //swap
                 int tmp=a[i];
                 a[i]=a[j];
                 a[j]=tmp;
             }
        }
        i++;
        int tmp =a[i];
        a[i]=pivot;
        a[high]=tmp;
         return i;
    }
     void quick_sort(int[] a,int low,int high) {
         if(high>low)
         {
             int pidx= partition(a,low,high);

             quick_sort(a,low,pidx-1);
             quick_sort(a,pidx+1,high);
         }

     }



}
    class Mainloop{
    public static void main(String[] args) {
        int arr[] = new int[]{23, 15, 7, 2, 3, 5};
        sorting sot= new sorting();
       sot.bubble_sort(arr);
       sot.selection_sort(arr);
       sot.insertion_sort(arr);
       sot.quick_sort(arr,0, arr.length-1);
       System.out.println("Quick sort");
       sot.Print(arr);

    }
}
