package Recursion_2;/*
  place tiles of size 1*m in a floor of size n*m
  time complexity =O(n)
 */

 class Recursion3_PlaceTiles {
     public static void main(String[] args) {
        int n=4 ,m=2;
         System.out.println(placeTiles(n,m));

     }
     public static int placeTiles(int n,int m){
          if(n == m ){
              return 2;
          }
          if(n<m){
              return 1;
          }
         //vertically
         int vertPlacements = placeTiles(n-m , m);

         //horizontally
         int horPlacements = placeTiles(n-1,m);

         return vertPlacements + horPlacements ;
     }
}
