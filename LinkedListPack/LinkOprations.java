package com.company.LinkedListPack;

//removing nth element from the last od the linklist


public class LinkOprations {

    public static void removeNth(int n, LinList.Node head) {

        int size=0;
        LinList.Node curr,prev;
        curr=head;
        while (curr!= null){
            curr=curr.next;
            size++;
        }
          if(head ==null) return;

          if(n==size){
              head=head.next;
              return;
          }
         int dfs=size-n+1;
          int ent=0;
          while(ent !=dfs ){
              prev=curr;
              curr=curr.next;
              ent++;
          }
          prev=curr.next;
    }



}
