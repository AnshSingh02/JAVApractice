import java.util.*;
public class rotatedarr {
    public static int CountRotated(int arr[], int n) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
             int next = (mid + 1) % n;
             
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid ;
            }

            else if (arr[mid] <= arr[end]){
                end = mid - 1;
            }
            else if (arr[mid] >= arr[start]){
                start = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
        int n = arr.length;
        System.out.println("Total rotations: " + CountRotated(arr, n));
    }
}