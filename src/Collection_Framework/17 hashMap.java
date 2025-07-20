import java.util.*;
 class hashMap {
     public static void main(String[] args) {
         //country(key) , population(value)
         HashMap<String, Integer> map = new HashMap<>();

         //Insert
         map.put("India", 120);
         map.put("Us", 30);
         map.put("China", 150);
         System.out.println(map);

         map.put("China", 180);
         System.out.println(map);

         //search
         if(map.containsKey("China")) {
             System.out.println("key is present in map");
         }else{
             System.out.println("key doesnot present");
         }
         //we want to search value using with key
         System.out.println(map.get("China"));
         System.out.println(map.get("Indonesia"));

                     //Iteration
//         int arr[] = {12,15,18};
//         for(int i=0; i<3; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         //another method to print loop
//         for(int val : arr){
//             System.out.print(val+ " ");
//         }
//         System.out.println();

//         for(Map.Entry<String, Integer> e : map.entrySet()){
//             System.out.println(e.getKey() +" "+e.getValue());
//         }
//         //iteration using keyset another method
//         Set<String> keys = map.keySet();
//         for(String key : keys){
//             System.out.println(key+" "+ map.get(key));
//         }
          //to remove the value
         map.remove("China");
         System.out.println(map);
     }
}