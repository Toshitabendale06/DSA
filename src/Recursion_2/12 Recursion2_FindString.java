package Recursion_2;/* Find the 1st and last occurance of an element in string
ex="abaacdaefaah"  elemet="a"  frist time idx=0 me aaya ,last time idx=10 me aya
 */

 class Recursion2_FindString {
     public static int first= -1;
     public static int last= -1;

     public static void main(String[] args) {
        String str="abaacdaefaah";
         findOccurance(str , 0 ,'a');
     }

     public static void findOccurance(String str,int idx,char element){
         if(idx == str.length()){
             System.out.println("we get fist 'a' at idx = "+first);
             System.out.println("we get last 'a' at idx = "+last);
             return;
         }

         char currChar = str.charAt(idx);   //a
         if(currChar == element){         //a=a
              if(first == -1){
                  first = idx;
              }else{
                  last =idx;
              }
         }

         findOccurance(str , idx+1 ,element);
     }
}
