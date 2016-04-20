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
    List<Integer> reversed = new LinkedList<>();
    Node ptr = head;
    while(ptr != null) {
        reversed.add(ptr.data);
        ptr = ptr.next;
    }
 
    if(reversed.isEmpty()) return;
    
    Collections.reverse(reversed);
  
    for(Integer z: reversed) {
        System.out.println(z);
    }
}
