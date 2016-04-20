/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

int GetNode(Node head,int n) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    int ll = 0;
    Node ptr = head;
    while(ptr.next != null) {
        ptr = ptr.next;
        ll++;
    }
    
    int si = ll - n;
    //System.out.println("List length: " + ll + " need to print element " + si);
    ptr = head;
    while(si-- > 0) {
        ptr = ptr.next;
    }
    return ptr.data;
}
