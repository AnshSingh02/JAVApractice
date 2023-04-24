import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter two nembers :");
        int a =in.nextInt();
        int b =in.nextInt();
        
        if (a>=b){
            System.out.println(" a is largest");
            
        }
        else{
            System.out.println("b is largest");
            
        }
    }
}