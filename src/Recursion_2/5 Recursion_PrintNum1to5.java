package Recursion_2;

class Recursion_PrintNum1to5 {
     public static void main(String[] args) {
         int num=1;
         printNumb(num);
     }
     public static void printNumb(int num){
         if(num==6) return;
         System.out.println(num);   //num=1,2,3
         printNumb(num+1);       //1+1=2,2+1=3,3+1=4
     }
}
