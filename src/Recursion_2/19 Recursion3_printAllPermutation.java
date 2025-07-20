package Recursion_2;/*
Print all permutation of a string
ex="abc" --->abc,acb,bac,bca,cab,cba
Time complexity = O(n!)
 */

class Recursion3_printAllPermutation {
     public static void main(String[] args) {
      String str = "abc";
      printPermutation(str,"");
     }
     public static void printPermutation(String str,String permutation){
         if(str.length() == 0){
             System.out.println(permutation);
             return;
         }
         for(int i=0;i<str.length();i++) {
             //"abc " -> currChar = b
             char currChar = str.charAt(i);
             //new str = a+c -> ab
             String newStr = str.substring(0,i) + str.substring(i+1);
             printPermutation(newStr,permutation+currChar);

         }
     }
}
