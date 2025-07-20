package Recursion_2;/*
Print all the subsets of a set of first n natural numbers
Time complexity = O(2^n)
 */

import java.util.ArrayList;

class Recursion3_PrintAllSubsets {
     public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n,subset);
     }
     public static void printSubset(ArrayList<Integer> subset){
         for(int i=0;i<subset.size();i++){
             System.out.print(subset.get(i)+" ");
         }
         System.out.println();
     }

     public static void findSubsets(int n ,ArrayList<Integer> subset){
         if(n == 0){
             printSubset(subset);
             return;
         }
         //add hoga
         subset.add(n);
         findSubsets(n-1 , subset);

         //add nahi hoga
         subset.remove(subset.size()-1);
         findSubsets(n-1,subset);
     }
}
