import java.util.*;
public class L{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();                                  
        if ( a > b && b > c){
            System.out.println("a is greatest");
        }
        if ( b > a && b > c){
            System.out.println("b is greatest");

        }
        else{
            System.out.println("c is largest");
        }

    }
}
