package Recursion_2;/*          print number from 5 to 1
          for(int i=5;i>0;i++){
                 sout(i)}
*/


class Recursion_PrintNumber {
    public static void main(String[] args) {
        int num=5;
        printNum(num);
    }
    public static void printNum(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printNum(num-1);
    }
}
