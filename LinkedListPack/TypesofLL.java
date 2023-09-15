package com.company.LinkedListPack;
class SinglyLL{
    private Node head;
    private Node tail;
    private int size;
    SinglyLL(){
        this.size=0;
    }
    private class Node{
        private String val;
        private Node nxt;

        public Node(String str,Node nxt){
            this.val=str;
            this.nxt=nxt;
        }
        public Node(String str){
            this.val=str;
        }
    }

    //   public Void inserstfist(String val){
//
//
//   }
    public void insfst(String str){
        Node nn=new Node(str,head);
        head=nn;
        if(tail==null){
            tail=head;
        }
        else{
            Node temp=head ;
            while(temp.nxt.nxt !=null){
                temp=temp.nxt;
            }
            tail=temp.nxt;
        }
        size++;
    }
    public void display(){
        Node curr=head;
        while(curr!=tail.nxt){
            System.out.println(curr.val);
            curr=curr.nxt;
        }
    }
    //    public Void inserstlst(String val){
//
//    }
    public  void indlst(String val) {
        Node nn=new Node(val,null);
        if(head==null){
        }
        Node curr=head;
        while (curr.nxt!=null){
            curr=curr.nxt;
        }
        curr.nxt=nn;
        tail=nn;

        size++;
    }

    public void insert(String data, int inx){

        if(inx==0){
            insfst(data);
            return;
        }
        if(inx==size){
            indlst(data);
            return;
        }
        Node temp=head;
        Node nn=new Node(data);
        for (int i=1;i<inx-1;i++){
            temp=temp.nxt;
        }
        nn.nxt=temp.nxt;
        temp.nxt=nn;
        size++;


    }
    public Node ninx(int indx){
        Node curr=head;
        int i=0;
        while(i<indx){
            curr=curr.nxt;
            i++;
        }
        tail=curr;
        return tail;
    }

    public int getSize() {
        return size;
    }
    public void delfst(){
        if (head == null)
        {
            System.out.println("No Elements in list");
        }
        head=head.nxt;
    }

    public void dellst() {
        if (head==null){
            System.out.println("No Elements in list");
        }
        Node cur=head;
        while (cur.nxt.nxt!=null)
            cur=cur.nxt;
        cur.nxt=null;
    }

    public void delnth(int inx){
        if(inx==0){
            delfst();
            return;
        }
        if(inx==size){
            dellst();
            return;
        }
        Node temp=head;
        for (int i=1;i<inx-1;i++){
            temp=temp.nxt;
        }

        temp.nxt=temp.nxt.nxt;
    }
}
//Doubbly Linked list
class DoblyLL {
    NodeDL dhead;

    class NodeDL{
        String data;
        NodeDL prev;
        NodeDL next;
        int size=0;
        public   NodeDL(String data){
            this.data=data;
            this.prev=null;
            this.next=null;
            this.size++;
        }
    }
    public void fistIns(String st){
        NodeDL nn=new NodeDL(st);
        if(dhead==null){
            dhead=nn;
            return;
        }
        dhead.prev=nn;
        nn.next=dhead;
        dhead=nn;
    }



    public void lstIns(String st){
        NodeDL nn=new NodeDL(st);
        if(dhead==null)dhead=nn;
        NodeDL cur=dhead;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=nn;
        nn.prev=cur;
    }
    public void nthIns(int n,String dt){
        NodeDL cur=dhead;
        if(dhead==null){
            return;
        }
        NodeDL nn=new NodeDL(dt);
        for (int i = 1; i < n; i++) {
            cur=cur.next;
        }
        nn.prev=cur;
        nn.next=cur.next;
        cur.next=nn;
    }
    public  void disply(){
        NodeDL cur=dhead;
        if(dhead==null){
            System.out.println("No Elements");
        }
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
}
class CircularLL{
    NodeCL chead;
    NodeCL ctail;
    class NodeCL{
        String data;
        NodeCL next;

        public   NodeCL(String data){
            this.data=data;
            this.next=null;
        }
    }
    void cirins(String st){
        NodeCL nn=new NodeCL(st);
        if(chead==null) {
            chead=nn;
            ctail=nn;
        };
        ctail.next=nn;
        nn.next=chead;
        ctail=nn;
    }
    void cirdel(String st){

        NodeCL curr=chead,prev=chead;
        while(curr.data != st){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
    }
    void  cldis(){
        NodeCL cur=chead;
        if(chead!=null){
            do{
                System.out.println(cur.data);
                cur=cur.next;
            }while (cur!=chead);
        }

    }
}
public class TypesofLL {
    public static void main(String[] args) {
        //O(1) is TC for insertion deletion O(n) is TC for search,Iterate
        SinglyLL sl=new SinglyLL();
        sl.insfst("23");
        sl.insfst("24");
        sl.indlst("22");
        sl.indlst("21");

        sl.insert("2",2);

        sl.dellst();
        sl.delfst();
        sl.delnth(2);
        sl.display();
        System.out.println("Signally Linked List");

        DoblyLL dl=new DoblyLL();
        dl.fistIns("23");
        dl.lstIns("25");
        dl.fistIns("22");
        dl.lstIns("56");
        dl.nthIns(3,"28");
        dl.disply();

        System.out.println("Dobly Linked List");
        CircularLL cl=new CircularLL();
        cl.cirins("34");
        cl.cirins("45");
        cl.cirins("47");
        cl.cirdel("45");
        cl.cldis();
        System.out.println("Circular Linked List");
    }
}
