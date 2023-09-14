import java.util.*;
public class maxSubarray{
    public static void PrintSubarray(int arr[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0 ; i < arr.length ; i++) {
            int start = i ;
            for(int j =1 ; j<arr.length ; j++){
                int end = j;
                currSum = 0 ;
                 for (int k=start ; k <=end ; k ++){
                     currSum += arr[k];

                 }
                 System.out.println(currSum);
                 if(maxSum < currSum){
                    maxSum = currSum; 
                 }
            }
        }
        System.out.println(" max sum = " +maxSum);
    }
     public static void main(String[] args) {
        
        int arr[] = { 2 , 9 , 10 , 12 , -7 } ;
        PrintSubarray(arr);
     }
        
    }
