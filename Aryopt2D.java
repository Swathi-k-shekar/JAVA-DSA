package com.company;

public class Aryopt2D{
    public static void spiralMatrix(int[][] arr){
        int stcol=0,strow=0,endcol= arr[0].length-1,
                endrow= arr.length-1;

        while(strow<=endrow && stcol<=endcol){
            //top
            for (int col = stcol; col <endcol ; col++) {
                System.out.print(arr[strow][col]+" ");
            }
            //right
            for (int row = strow; row <endrow ; row++) {
                System.out.print(arr[row][endcol]+" ");
            }
            //botom
            for (int col = endcol; col >stcol ; col--) {
                System.out.print(arr[endrow][col]+" ");
            }
            //left
            for (int row = endrow; row >strow ; row--) {
                System.out.print(arr[row][stcol]+" ");
            }
            strow+=1;
            endrow-=1;
            stcol+=1;
            endcol-=1;
        }
    }
    //Diagonal Sum
    public  static int diagonalSum(int[][] arr){
        int sum=0,csum=0;
//        for (int row = 0; row < arr[0].length; row++) {
//            for (int col = 0; col < arr[0].length; col++) {
//                if(col==row){
//                    sum+=arr[col][row];
//                }
//            }
//            int col= arr[0].length-1;
//            csum+=arr[row][col-row];
//        }
//        System.out.println(sum);
//        System.out.println(csum);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            if(i!= arr.length-1-i)
                sum+=arr[i][arr.length-1-i];
        }
     return sum;
    }
public static int searhSortedMatrix(int[][] a,int key){
        int ser=-1,row=0,col=a[0].length-1;
        while (row <a.length && col>=0){
            if(a[row][col]==key)
                return 1;
            if(key < a[row][col]){
                col-=1;
            }
            if(key > a[row][col]){
                row+=1;
            }
        }
        return ser;
    }
    public static void main(String[] args) {
       int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},
               {13,14,15,16}};

//       spiralMatrix(a);
//       int sum=diagonalSum(a);
//        System.out.println(sum);
        System.out.println(searhSortedMatrix(a,100));
    }
}
