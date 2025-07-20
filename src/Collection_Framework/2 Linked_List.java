 class Linked_List {
    Node head;
    private int size;

    Linked_List(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add --> First , Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print  --> similar code as addlast
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }


    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("This list is empty ");
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("This lst is empty");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;  //head.next = null --> lastNode = null
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        System.out.println("\t\tThis is for add");
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        //delete
        System.out.println("\t\tthis is for delete");
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        //size
        System.out.println("size is = "+list.getSize());



    }
}
