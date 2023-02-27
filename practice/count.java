import java.util.Scanner;
public class count{
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int count = 0 ;
    System.out.println("enter a number ::");
    int num = in.nextInt();
    while (num!=0){
        num = num / 10;
       count++;
    }
    System.out.println("Number of digits::"+count);
    }
    
}