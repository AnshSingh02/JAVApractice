import java.util.*;
public class linearp{
    public static int linears(int arr[], int key){
    
    for(int i = 0 ; i < arr.length ; i++){
        if (arr[i] == key){
            return i;
        }
    }
    return -1 ;
    }
    public static void main(String args[]) {
        int arr[] = { 2 ,4, 6 ,8 ,10 ,12};
        int key  = 8 ;
        System.out.println("key is preent at index "+linears(arr, key));
    }
}
