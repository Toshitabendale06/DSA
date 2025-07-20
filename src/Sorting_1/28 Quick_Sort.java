package Sorting_1;

//Time complexity = o(n^2)
class Quick_Sort {
     public static void main(String[] args) {
         int[] arr = {6,3,9,5,2,8};
         int n= arr.length;

         quickSort(arr , 0 ,n-1);
         //print
         for(int i=0; i<n; i++){
             System.out.print(arr[i]+" ");
         }
     }

     public static int partition(int arr[] , int low , int high){
         int pivot = arr[high];
         int i= low-1;

         //o(n^2)
         for(int j=low; j<high; j++){
             if(arr[j] < pivot){
                 i++;
                 //swap
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
         i++;
         int temp = arr[i];
         arr[i] = pivot;
         arr[high] = temp;
         return i;  //pivot index
     }

     public static void quickSort(int arr[] ,int low, int high){
             if(low < high){
                 int pivot = partition(arr,low,high);

                 quickSort(arr , low , pivot-1);
                 quickSort(arr ,pivot+1 , high);
             }
     }
}
