import java.util.*;

public class nooccurance {
    public static int firstOccurrence(int numbers[], int key) {
        int start = 0, end = numbers.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == numbers[mid]) {
                result = mid;
                end = mid - 1;
            } else if (key < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int numbers[], int key) {
        int start = 0, end = numbers.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == numbers[mid]) {
                result = mid;
                start = mid + 1;
            } else if (key < numbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 10, 10, 10, 12 };
        int key = 2;
        int first = firstOccurrence(numbers, key);
        int last = lastOccurrence(numbers, key);
        
            int nooccurance = (last - first) + 1;
            System.out.println("Number of occurrences: " + nooccurance);
        } 
    }
