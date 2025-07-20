package Recursion_2; //// 1. print x^n (stack heigth = n)
// class Recurson_printXPn {
//     public static void main(String[] args) {
//         int x=2 ,n=5;
//         int ans = calPower(x,n);
//         System.out.println(ans);
//     }
//     public static int calPower(int x,int n){
//         if(n==0) return 1;    //base case1
//         if(n==0) return 0;    //base case 2
//
////         int xpower1 = calPower(x,n-1);
//         int xPower = x * calPower(x,n-1);   //humara kam
//         return xPower;
//     }
//}

// 2. print x^n (stack heigth = log n)
class Recurson_printXPn {
    public static void main(String[] args) {
        int x=2 ,n=5;
        int ans = calPower(x,n);
        System.out.println(ans);
    }
    public static int calPower(int x,int n){
        if(n==0) return 1;    //base case1
        if(n==0) return 0;    //base case 2

//         if n is even
        if(n% 2==0){
            return calPower (x,n/2)* calPower(x,n/2);
        }else{
            return calPower (x,n/2)* calPower(x,n/2)*x;

        }
    }
}
