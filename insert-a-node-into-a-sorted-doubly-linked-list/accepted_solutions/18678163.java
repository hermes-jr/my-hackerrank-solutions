/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    
    if(head == null) {
        Node newHead = new Node();
        newHead.data = data;
        return newHead;
    }
    
    Node prev = head;
    while(true) {
        if(prev.next == null || prev.next.data > data) break;
        prev = prev.next;
    }
    
    Node insert = new Node();
    insert.data = data;
    
    insert.next = prev.next;
    if(prev.next != null) { prev.next.prev = insert; }
    insert.prev = prev;
    prev.next = insert;
    
    return head;
}
