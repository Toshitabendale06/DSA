package Recursion_2;/*                   IMPORTANT
Print all the subSequence of a string
ex="abc" ---->
Time complexity = o(2^n);
 */

class Recursion2_PrintAllSubsequence {
     public static void main(String[] args) {
       String str = "abc";
       subsequence(str,0,"");
     }
     public static void subsequence(String str,int idx,String newString){
         if(idx == str.length()){
             System.out.println(newString);
             return;
         }
         char currChar = str.charAt(idx);
         //to be
         subsequence(str,idx+1,newString+currChar);

         //or not to be
         subsequence(str,idx+1,newString);

     }
}
