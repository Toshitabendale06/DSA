package Recursion_2;/*
Remove duplicates in a string
ex="abbccda"  ---->abcd
Time complexity = O(n);
 */

class Recursion2_RemoveDuplicateString {
     public static void main(String[] args) {
        String str ="abbccda";
        removeDuplicates(str,0,"");
     }
     public static boolean[] map= new boolean[26];

     public static void removeDuplicates(String str,int idx, String newString){
         if(idx == str.length()){
             System.out.println(newString);
             return;
         }
         char currChar = str.charAt(idx);
         if(map[currChar - 'a']){
             removeDuplicates(str,idx+1,newString);
         }else{
             newString += currChar;
             map[currChar - 'a'] = true;
             removeDuplicates(str,idx+1,newString);
         }
     }
}
