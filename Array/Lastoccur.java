import java.util.*;
public class Lastoccur{
    public static int Lastoccurance(int numbers[] , int key){
        int start = 0 , end = numbers.length - 1 , result = 0;
        while (start <= end){
          int  mid  = start + (end - start)/ 2;
            if (key == numbers[mid]){
               result = mid ;
              start = mid  + 1;

            }
            else if( key < numbers[mid]){
                end  = mid -1 ;
            }
            else {
                start = mid + 1 ;
            }
             
        }
    return result;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 10 , 10 , 10 ,12};
        int key = 10 ;
        System.out.println(" index last :"+Lastoccurance(numbers, key));
    }
}