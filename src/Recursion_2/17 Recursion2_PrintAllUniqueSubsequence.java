package Recursion_2;/*
Pint all unique subsequence of a string
ex="aaa"  ----> a
Time complexity = o(n^2)
 */

import java.util.HashSet;

class Recursion2_PrintAllUniqueSubsequence {
     public static void main(String[] args) {
        String str = "aaa";
         HashSet<String> set = new HashSet<>();
        uniqueSubsequence(0,str,"",set);
     }
     public static void uniqueSubsequence(int idx, String str,String newString,HashSet<String> set){
         if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
         }
         char currChar = str.charAt(idx);

         uniqueSubsequence(idx+1,str,newString+currChar,set);

         uniqueSubsequence(idx+1,str,newString,set);
     }
}
