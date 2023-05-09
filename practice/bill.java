import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of pencil,penand eraser");
        float pencil = in.nextFloat();
        float pen    = in.nextFloat();
        float eraser = in.nextFloat();

        float total = pencil+pen+eraser;

        System.out.println("bill is : "+total);

        float newTotal =  total + ( 0.18f * total);
        System.out.println("bill with gst"+ newTotal);



    }
}
