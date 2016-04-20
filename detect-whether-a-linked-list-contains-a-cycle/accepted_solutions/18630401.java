/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    if(head == null || head.next == null) return 0;

    Node tort = head;
    Node rab = head.next;

    while(true) {
        if(tort == null || tort.next == null) return 0;
        
        if(tort == rab) return 1;
        tort = tort.next;
        
        if(rab.next == null || rab.next.next == null) { rab = head; continue; }
        rab = rab.next.next;
    }
}
