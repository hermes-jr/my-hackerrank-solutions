/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    if(head == null) {
        Node nn = new Node();
        nn.data = data;
        return nn;
    }
    Node tl = head;
    while(true) {
        if(tl.next == null) {
            Node nn = new Node();
            nn.data = data;
            nn.next = null;
            tl.next = nn;
            return head;
        }
        tl = tl.next;
    }
    
}
