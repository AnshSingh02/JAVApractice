import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

     int avg = (a+b+c) /3;
     System.out.println(avg);
     
    }
}