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
    Node insert = new Node();
    insert.data = data;
    
    if(head == null) { return insert; }
    
    Node prev = head;
    while(prev.next != null && prev.next.data < data) {
        prev = prev.next;
    }
    
    insert.prev = prev;
    insert.next = prev.next;
    
    if(prev.next != null) { prev.next.prev = insert; }
    prev.next = insert;
    
    return head;
}
