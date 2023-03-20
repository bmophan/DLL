package doublylinkedlist;

class Node {
    public int data;
    public Node previous, next;
    
    public Node(int d) {
        data = d;
        previous = next = null;
    }
}
