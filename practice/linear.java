import java.util.*;
public class linear{
static int linearSearch(int[] arr ,int target){

for(int index = 0; index< arr.length ; index++){
    
    if(arr[index] == target){
        return index;
    }
}
 return -1;
}
 public static void main(String[] args){
    int[] arr = {23 ,-45 ,5 ,567, 7, 8 ,45};
    int target = 5;
    int ans = linearSearch(arr, target);
    System.out.println(ans);
 }
}