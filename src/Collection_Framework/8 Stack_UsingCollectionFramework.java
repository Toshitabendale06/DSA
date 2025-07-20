import java.util.*;
 class Stack_UsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        //push
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //peek & pop
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }
    }
}
