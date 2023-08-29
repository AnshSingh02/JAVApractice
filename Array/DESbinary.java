import java.util.*;
public class DESbinary{
public static int binarysearchdes(int numbers[] , int key){
    int start = 0 , end = numbers.length - 1;
    while(start <= end){
       int  mid = start + (end - start)/2 ;
        if( numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] > key){
           start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
}
public static void main(String args[]) {
    int numbers[] = { 20, 17, 15, 14, 13, 12, 10, 9, 8, 4};
    int key = 4;
    System.out.println("index is : " + binarysearchdes(numbers, key));
    
}
}