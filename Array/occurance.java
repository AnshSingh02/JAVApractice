import java.util.*;
public class occurance{
public static int Istoccurance(int numbers[] , int key){
    int start = 0 , end = numbers.length - 1;
    while (start <= end){
        int mid = start + (end - start)/2;
        if (numbers[mid] == key){
           int result  = mid;
            start = mid + 1;
        }
        else if ( key < numbers[mid]){
            end  = mid  - 1;
        }
        else{
            start  = mid + 1;
        }
        return mid;
    }
    return -1;
    

}
public static void main(String args[]) {
    int numbers[]={ 2, 4, 10 , 10 , 10 , 12};
    int key = 10 ;
    System.out.println("index 1st occurance is : " +Istoccurance(numbers, key));
    
}
}