import java.util.*;
public class sumofall{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any no");
        int  no = sc.nextInt();
        int sum = 0, value=1;
        for(int i=0 ; i<=10 ; i++){
            value = no*i;
            System.out.println(value+" ");
            sum=sum + value ; 
              }
              System.out.println("sum is  "+sum);
    }
}