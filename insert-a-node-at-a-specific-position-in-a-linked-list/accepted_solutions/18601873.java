/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newNode = new Node();
    newNode.data = data;
    
    if(position == 0 || head == null) {
        // first element added
        newNode.next = head;
        return newNode;    
    }
    
    Node cur = head;
    while(--position > 0) {
        cur = cur.next;
    }
    
    newNode.next = cur.next;
    cur.next = newNode;
    return head;
}
