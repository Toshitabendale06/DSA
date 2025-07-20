package Recursion_2;

//time complextity = o(n) ---> where "n=str.length "of string
class Recursion2_StringInReverse {
     public static void main(String[] args) {
        String str="abcd";
        printReverse(str,str.length()-1);
     }
     public static void printReverse(String str, int idx){
           if(idx == 0){
               System.out.println(str.charAt(idx));
               return;
           }
         System.out.print(str.charAt(idx));
           printReverse(str,idx-1);
     }
}
