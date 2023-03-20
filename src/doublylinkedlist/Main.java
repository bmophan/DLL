package doublylinkedlist;

class Main {
    public static void main(String[] args) {
        var list = new DLL();
        if (list.isEmpty()) {
            Node newNode = new Node(3);
            list.end = list.start = newNode;
        }
        list.insert(null, 2);
        list.insert(null, 1);
        list.insert(list.start, 4);
        list.insert(list.end, 5);
        
        list.display("Your list:");
    }
}
