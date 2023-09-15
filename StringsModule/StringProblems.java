package com.company.StringsModule;


public class StringProblems {
//    uppercase of evey 1st letter Hello Word
// occorance of number or letter
public static String occrence(String str) {
    StringBuilder sb=new StringBuilder(" ");
    int n=str.length();
    int cnt=0;
    for (int i = 0; i <n-1 ; i++) {
        if(str.charAt(i)==str.charAt(i+1)) cnt++;
        if (str.charAt(i)!=str.charAt(i+1)){
            sb=sb.append(str.charAt(i)+""+(cnt+1));
            cnt=0;
        }
//        if ( i==n-2)
//            sb=sb.append(str.charAt(i)+""+(cnt+1));

    }
    return sb.toString();
}
//string comparision
    public static Boolean comparision(String str1,String str2){
        Boolean obj=false;
//        if(str1==str2) obj=true;
        if(str1.equals(str1)) obj=true;
      return obj;
    }
    //palindrome
    public static Boolean palindrome(String str){
        Boolean pal=false;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)) pal=true;
            else pal=false;
        }
      return pal;
    }
    public static double pathDisplacement(String str, int n){
        double len=0;
        int x=0,y=0;
        for (int i = 0; i < n; i++) {
            char dir=str.charAt(i);
            if(dir=='N'){
                y+=1;
            }
            if(dir=='S'){
                y-=1;
            }
            if(dir=='E'){
                x+=1;
            }
            if(dir=='W'){
                x-=1;
            }
        }
        int x2=x*x;
        int y2=y*y;
        len=Math.sqrt(x2+y2);
        return len;

    }
    public static String largestString(String[] str){
        int strn;
        String strf=str[0];
        for (int i = 0; i < str.length-1; i++) {
            if(strf.compareTo(str[i+1])>0) strf=str[i];
            else strf=str[i+1];
        } 
        return strf;
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        String str1="swathi",str2="swathi";
        String str=new String("Swathi");
        int t=path.length();
        System.out.println(palindrome("MADAM"));
        System.out.println(pathDisplacement(path,t));
        System.out.println(comparision(str1,str));
        System.out.println(comparision(str1,str2));
        System.out.println(str.substring(2,5));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareToIgnoreCase(str));
        String[] strg=new String[]{"swathi","spandana","spurthey","shambavi"
                ,"channi"};
        System.out.println(largestString(strg));
//        System.out.println(str1);
//        str2 =str1+" sdf ";
//        System.out.println(str2);
//        System.out.println(str1);
        //string bulider
        StringBuilder sb=new StringBuilder("Swathi ");
        sb.append("K S");
        System.out.println(sb);

        System.out.println(occrence("aaaaaddddbbhhhe"));
    }
}
