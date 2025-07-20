import java.util.*;

 class LInkedList_CollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //add first
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        //add last
        list.addLast("List");
        System.out.println(list);

        //size
        System.out.println(list.size());

        //print
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");

        //delete first
        list.removeFirst();
        System.out.println(list);

        //delete last
        list.removeLast();
        System.out.println(list);

        //if we want to remove the selected one we can remove my passing the index
        list.add("Toshita");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }

}
