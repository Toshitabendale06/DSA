package Recursion_2;/*
print keypad combination
Time complexity = o(4^n)
 */

class Recursion2_printKeypadCombination {
     public static void main(String[] args) {
       String str = "23";
       printCombination(str,0,"");
     }
     public static String[] keypad = {".","abc","def","ghi","kjl","mno","pqrs"};

     public static void printCombination(String str,int idx,String combination){
         if(idx== str.length()){
             System.out.println(combination);
             return;
         }
         char currChar = str.charAt(idx);
         String mapping = keypad[currChar - '0'];  //2 -0=2 ---->def

         for(int i=0;i<mapping.length();i++){
             printCombination(str,idx+1,combination+mapping.charAt(i));
         }
     }
}
