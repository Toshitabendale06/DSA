package Recursion_2;

class Recursion_SumOfNaturalNum {
     public static void main(String[] args) {
         int num =5;
         int sum=0;
         int i=1;
         printSum(i,num,sum);
     }
     public static void printSum(int i,int num ,int sum){
         if(i==num) {
             sum+=i;
             System.out.println(sum);
             return;
         }
         sum=sum+i;
//         System.out.println(sum);
         printSum(i+1,num,sum);
     }
}
