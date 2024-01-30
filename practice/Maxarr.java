import java.util.*;
public class Maxarr{
    static int max(int[] arr){
    int maxVal  = arr[0];
    for (int  i = 1 ; i<arr.length ; i++){
        if (arr[i] > maxVal){
            maxVal = arr[i];
        }
    }
    return maxVal;
}
public static void main(String[] args){
    int arr[]= {1 ,3 ,45 ,67, 7};
    System.out.println(max(arr));
}
}