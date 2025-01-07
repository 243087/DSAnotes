package com.rahul.kumar.Module7Day53_LinkedListProblemAndDoublyLL;

import java.util.HashMap;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key,int value){
        this.value = value;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
public class Program1_Assignment2_LRUcache {
 
	int capacity;
    int size;
    Node dummyHead;
    Node dummyTail;
    HashMap<Integer,Node> map;
    public Program1_Assignment2_LRUcache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.dummyHead = new Node(-1,-1);
        this.dummyTail = new Node(-1,-1);
        this.map = new HashMap<>();

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    public void remove(Node x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
    }
    public void addLast(Node x){
         Node secondLast = dummyTail.prev;
         secondLast.next = x;
         x.prev = secondLast;

         x.next = dummyTail;
         dummyTail.prev = x;
    }
    public int get(int key) {
        if(map.containsKey(key)==false)
            return -1;

        Node n = map.get(key);
        remove(n);
        addLast(n);
        return n.value;    
        
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)==true){
            Node n = map.get(key);
            n.value = value;
            remove(n);
            addLast(n);
            return;
        }
        Node n = new Node(key,value);
        if(size<capacity){
            addLast(n);
            map.put(key,n);
            size++;
        }
        else if(size == capacity){
            Node dm = dummyHead.next;
            remove(dm);
            int keytobeDeleted = dm.key;
            map.remove(keytobeDeleted);

            addLast(n);
            map.put(key,n);
        }
    }
}
