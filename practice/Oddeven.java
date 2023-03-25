import  java.util.Scanner;
public class Oddeven{
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0){
            System.out.println("even");
           
        }
        else{
            System.out.println("odd");
        }
    }
}