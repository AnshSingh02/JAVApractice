import java.util.*;

public class ArrayCC{
 public static int getLargest(int arr[]){
    int largest = Integer.MIN_VALUE;

    for (int  i = 0 ; i < arr.length; i++){
        if (largest < arr[i]){
            largest = arr[i];
        }
    }
    return largest;
 }
 public static void main(String args[]){
    int arr[] = { 2, 4, 6, 8};
    System.out.println("largest value ; "+getLargest(arr));
 }
}