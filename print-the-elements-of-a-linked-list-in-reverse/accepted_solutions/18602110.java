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

void ReversePrint(Node head) {
    int lastIndex = 0;
    
    if(head == null) return;
    // get tail
    Node ptr = head;
    while(ptr.next != null) {
        lastIndex++;
        ptr = ptr.next;
    }
 
    for(int pp = lastIndex; pp >= 0; pp--) {
        ptr = head;
        for(int cp = 0; cp < pp; cp++) {
            ptr = ptr.next;
        }
        System.out.println(ptr.data);
    }
}
