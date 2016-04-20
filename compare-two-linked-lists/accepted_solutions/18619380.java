/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node ptrA = headA;
    Node ptrB = headB;
    while(true) {
        if(ptrA == null ^ ptrB == null) return 0;
        if(ptrA.data != ptrB.data) return 0;
        ptrA = ptrA.next;
        ptrB = ptrB.next;
        if(ptrA == null && ptrB == null) return 1;
    }
}
