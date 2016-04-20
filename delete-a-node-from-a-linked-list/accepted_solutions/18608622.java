/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(head == null) return null;
    
    if(position == 0) return head.next;
    
    Node ptr = head;
    for(int pos = 0; pos < position - 1; pos++) {
        ptr = ptr.next;
    }
    Node hop = ptr.next;
    ptr.next = hop.next;
    
    return head;

}

