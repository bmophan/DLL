package doublylinkedlist;

import java.io.*;

class DLL {
    // Create 2 Node to point head and tail of Doubly Linked List.
    public Node start;
    public Node end;
    
    // Create pos pointer.
    public Node pos;
    
    // Constructor.
    public DLL() {
        start = end = null;
    }
    
    // Check if List is empty.
    public boolean isEmpty() {
        return start == null;
    }
    
    // p == null then insert before start and assign start = newNode.
    // p == end then assign end = newNode.
    public void insert(Node p, int data) {
        Node newNode = new Node(data);
        if (p == null) {
            newNode.next = start;
            start.previous = newNode;
            start = newNode;
        } else {
            newNode.next = p.next;
            newNode.previous = p;
            if (p != end) p.next.previous = newNode;
            else end = newNode;
            p.next = newNode;
        }
    }
    
    // Display the list to the screen.
    public void display(String msg) {
        var pw = new PrintWriter(System.out, true);
        
        pw.print(msg);
        pw.flush();
        pos = start;
        while(true) {
            pw.print(" " + pos.data);
            pw.flush();
            pos = pos.next;
            if (pos == end.next) {
                pw.print(".\n");
                pw.flush();
                break;
            }
        }
    }
}
