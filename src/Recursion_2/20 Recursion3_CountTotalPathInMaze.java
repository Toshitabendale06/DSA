package Recursion_2;/*
Count total paths in a maze to move from (0,0) to (n,m)
Time complexity = o(2^(n+m))
 */

class Recursion3_CountTotalPathInMaze {
     public static void main(String[] args) {
        int n=3 , m=3;
        int totalPaths = countPaths(0,0,n,m);
         System.out.println(totalPaths);
     }
     public static int countPaths(int i,int j ,int n,int m ){
        if(i == n || j == m){
            return 0;
        }
         if(i == n-1 && j == m-1){
            return 1;
        }
         //move downwards
         int downPaths = countPaths(i+1,j,n,m);

         //move right
         int rightPaths = countPaths(i,j+1,n,m);

         return downPaths + rightPaths ;
     }
}
