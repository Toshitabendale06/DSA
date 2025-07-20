package Recursion_2;

class Recurson2_TowerOfHanoi {
     public static void main(String[] args) {
         int n=3;
         towerOfHanoi(n,"A","B","C");
     }
     public static void towerOfHanoi(int n, String BEN, String AUX, String END ){
         if(n==1 ) {
             System.out.println("transfer disk"+n+" from "+BEN+" to "+END);
             return;
         }
         towerOfHanoi(n-1,BEN,END,AUX);
         System.out.println("transfer disk"+n+" from "+BEN+" to "+END);
         towerOfHanoi(n-1,AUX,BEN,END);
     }

}
