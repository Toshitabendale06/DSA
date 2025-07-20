package Recursion_2;/*
Check if an array is sorted (Strictly increasing)
Time complexity = O(n);
 */

 class Recursion2_CheckIfArrayIsSorted {
     public static void main(String[] args) {
         int arr[] = {1,2,8,5};  //false
//         int arr[] = {1,2,5,6};  //true
         System.out.println(isSorted(arr,0));
     }
     public static boolean isSorted(int arr[],int idx){
         if(idx == arr.length-1){
             return true;
         }
          if(arr[idx]< arr[idx+1]){
              //array is sorted till now
             return isSorted(arr,idx+1);
          }
          else{
              return false;
          }
     }
}
