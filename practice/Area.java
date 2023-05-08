import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter side of square");
        int s = in.nextInt();

        int area = s*s;
        System.out.println(area);
    }
}
