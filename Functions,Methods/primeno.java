import java.util.*;
public class primeno{
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for (int i =2 ;i<=n ;i++){
    //         if(n% i == 0){//completely dividing
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
     public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
       for(int i = 2; i<=Math.sqrt(n);i++){
            if (n% i == 0){
                return false;
            }
        }
         return true;
     }
    public static void primeinRange(int n){
        for (int i=2 ; i<=n ; i++){
            if(isPrime(i)) {
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String  args[]) {
        primeinRange(20);
    }
}