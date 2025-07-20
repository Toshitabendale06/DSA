import java.util.ArrayList;
import java.util.Collections;
 class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        //add element in array list
        list1.add(10);
        list1.add(40);
        list1.add(30);
        list1.add(20);
        System.out.println(list1+" ");

        //get element
        int element = list1.get(1); //write index value whic you want
        System.out.println(element);

        //add element in between the array
        list1.add(0,50);
        System.out.println(list1+" ");

        //delete element
        list1.remove(4);
        System.out.println(list1+" ");

        //set
        list1.set(2,60);
        System.out.println(list1);


        //size
        int size = list1.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //sort element by using collection
        Collections.sort(list1);
        System.out.println(list1);
     }
}
