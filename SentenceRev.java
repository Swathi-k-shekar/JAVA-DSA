package com.company;

public class SentenceRev {

    public static void main(String[] args) {
       String st=new String("the sky is blue");
       int count=0;
        StringBuilder sb = new StringBuilder(" ");
       if(st.charAt(0)==' ')
           System.out.println(" ");
       else {
           for (int i = 0; i < st.length(); i++) {
               if (st.charAt(i) == ' ') count++;
           }
           int n = st.length() - 1;
           int cnt = 0;
           for (int i = n; i >= 0; i--) {
               if (st.charAt(i) != ' ') cnt++;
               if (st.charAt(i) == ' ') {
                   sb.append(st.substring(i + 1, i + cnt + 1) + " ");
                   cnt = 0;
               }
           }
           for (int i = 0; i <n ; i++) {
               if(st.charAt(i)==' '){
                   sb=sb.append(st.substring(0,i));
                   break;
               }
           }
       }
        System.out.println(sb);
    }
}
