import java.util.*;
public class positive{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int a =in.nextInt();

        if(a<0){
            System.out.println("a is negative ");
        }
        else{
            System.out.println("positive");
        }
    }
}
