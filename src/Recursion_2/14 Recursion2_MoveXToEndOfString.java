package Recursion_2;/*
MOve all 'X' to the end of the string
ex="axbcxxd"  --->abcdxxx
Time complexity = O(n)  ---> str.length=n
and for loop =n so n+n =O(2n)=o(n)*/

class Recursion2_MoveXToEndOfString {
     public static void main(String[] args) {
      String str = "axbcxxd";
      moveAllX(str,0,0,"");
     }
     public static void moveAllX(String str,int idx,int count,String newString){
         if(idx == str.length()){
             for(int i=0;i<count;i++){
                 newString +='x';
             }
             System.out.println(newString);
             return;
         }
         char currChar = str.charAt(idx);
         if(currChar == 'x'){
             count++;
             moveAllX(str,idx+1,count,newString);
         }else{
             newString += currChar;
             moveAllX(str,idx+1,count,newString);
         }
     }
}
