import java.util.*;
 class ReverseLInkedList_byCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
