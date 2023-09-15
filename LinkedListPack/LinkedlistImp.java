
// Singly linked list and its oprations
package com.company.LinkedListPack;

class LinList {
    Node head;
    private int size;
    LinList(){
        size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


public  void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
         head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;
  }
    public  void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while (cur.next!=null){
        cur=cur.next;
        }
        cur.next=newNode;
    }
    public void printlist(){

        Node cur=head;
        if(head==null) System.out.println("empty");
        while (cur!=null){
            System.out.print(cur.data);
            cur=cur.next;
        }
    }
    public  void deleteLast(){
        if(head==null){
            System.out.println("empty list");
        }
        if(head.next==null){
            System.out.println("NULL");
            size--;
        }
        else {
            Node cur = head.next;
            Node pre = head;
            while (cur.next != null) {
                pre = pre.next;
                cur = cur.next;
            }
            pre.next = null;
            size--;

        }
    }
  public  void delFist(){

        if(head==null){
            System.out.println("Empty");
        }
      size--;

        if(head.next==null) System.out.println("NULL");
        else{
            Node cur=head;
            head =cur.next;
        }
  }
  public int getSize(){
        return size;
  }

  public  void reverseList(){
      Node curr,prev=head,net;

        if(head==null) return;
        if(head.next==null) System.out.println("just a Single node");
        else{
            curr =head.next;
            while (curr!=null)
            {
                net=curr.next;
                curr.next=prev;

                prev=curr;
                curr=net;
            }
        }
        head.next=null;
  }
    public  void removeNth(int n) {

        int size=0;
        LinList.Node curr,prev;
        curr=head;
        while (curr!= null){
            curr=curr.next;
            size++;
        }
//        System.out.println(size);
        if(head ==null) return;

        if(n==size){
            head=head.next;
            return;
        }
        int dfs=size-n+1;
        int ent=1;
        prev=head;
        while(ent != dfs-1){
            prev=prev.next;
         ent++;
        }
        prev.next=prev.next.next;
    }

}


public class LinkedlistImp {
    public static void  main(String[] args){

        // Manual imp
        LinList l=new LinList();
        l.addFirst(" a ");
        l.addFirst(" is ");
        l.addFirst("Swathi ");
        l.addLast(" Good ");
        l.addLast(" Girl");
        l.printlist();
//        l.deleteLast();
//        System.out.println();
//        l.printlist();
//        System.out.println();
//        l.delFist();
//        l.printlist();
////        l.getSize();
//        System.out.println(l.getSize());
//        System.out.println();
//
//        l.reverseList();
//        l.printlist();
//        System.out.println();
////        //Built-in
//        LinkedList<String> list=new  LinkedList<String>();
//        list.add("See");
//        list.addFirst("Star");
//        System.out.println(list);
//        System.out.println(" " );
        l.removeNth(5);
        l.printlist();

   }
 }