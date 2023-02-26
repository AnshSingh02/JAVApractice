import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int ans  = 0;
        while (true){
            System.out.println("enter operator");
            char op = in.next().charAt(0);
            if (op == '+' || op =='-' || op =='*' || op =='/'){
                System.out.println ("enter two numbers");
                int num1 =in.nextInt();
                int num2 =in.nextInt();
                System.out.println();
            if (op == '+'){
                ans = num1 + num2 ;

            }
            if ( op =='-'){
                ans = num1-num2;
            }
            if (op =='*'){
                ans  =num1 *num2;
            }
            if ( op =='/'){
                ans =num1 /num2;
            }
            
            }
            System.out.println(ans);
                } 
    }
}