import java.util.*;
 class Question_SubarraySumEqualToK {
     public static void main(String[] args) {
//         int arr[] = {10,2,-2,-20,-10}; //ans = 3
         int arr[] = {1,-1,1,5};
         int k = -10;
         HashMap<Integer, Integer> map = new HashMap<>(); //<sum, Freq>

         map.put(0, 1); //empty subarray
         int ans = 0;
         int sum = 0;
         for(int j=0; j<arr.length; j++){
             sum+= arr[j];
             if(map.containsKey(sum-k)){
                 ans+= map.get(sum-k);  //freq me add kr diya
             }
             if(map.containsKey(sum)){
                 map.put(sum, map.get(sum) + 1);   //freq ko +1 kr diye agr exits hai
             }else{
                map.put(sum,1);
             }
         }
         System.out.println(ans);
     }
}
