import java.util.*;
public class binarypractice{
    public static int Binarysearch(int arr[] ,int key){
        int start = 0 , end = arr.length - 1;
        while (start < end){
            mid  = start + (end - start )/ 2;
             if ( key = mid ){
                return mid ;
             }
             if (arr[mid] <= key){
                end  = mid - 1;
             }
             else if (arr[mid] > key){
                start = mid + 1;
             }
        }
        return -1 ;
    }
    public static void main(Strin args []){
        int arr[] = { 2, 4, 6, 8 ,10 ,12};
        int key  = 3;
        System.out.println("key is at :"+Binarysearch(arr, key));
    }
    
}