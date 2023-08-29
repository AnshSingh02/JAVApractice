import java.util.*;
public class AscendDecend{
    public static int binarysearchascdes(int arr[] , int key){
        int start = 0 , end = arr.length - 1 ;
        while (start <= end){
         int  mid = start + (end - start)/ 2;
            if  ( arr[0] < arr[1]){
                if( arr[mid] == key){
                    return mid;
                }
                if(arr[mid] < key){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            if ( arr[0] > arr[1] ){
                if( arr[mid] == key){
                    return mid;
                }
                if(arr[mid] > key){
                   start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1 ;
    }
    public static void main(String args []) {
        int arr[] ={ 2 , 4 , 5 , 6, 7,  8, 9};
        int key = 6;
        System.out.println("index is : " + binarysearchascdes(arr, key) );        
    }
}