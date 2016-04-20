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
    // empty list or list containing two items, no cycle
    if(head == null || head.next == null) return 0;

    Node tort = head;
    Node rab = head.next;

    while(true) {
        // n = n+1 with no skips finished traversing a list. no cycles met
        if(tort == null || tort.next == null) return 0;
        
        // rab cycled and met tort. cycle detected
        if(tort == rab) return 1;
        // jump one position ahead
        tort = tort.next;
        
        // rab could skip a cycle point and found a pseudo-end of list, continue from beginning
        if(rab.next == null || rab.next.next == null) { rab = head; continue; }
        // jump two positions ahead
        rab = rab.next.next;
    }
}
