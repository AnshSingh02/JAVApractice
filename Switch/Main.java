import java.util.Scanner ;
public class Main {
     public static void main (String[] args) {

    Scanner in = new Scanner (System.in);
    String fruit = in.next();
     
    switch (fruit) {
        case "mango":
        System.out.println("King of fruits");
        break;
        case "Apple":
        System.out.println("A sweet red fruit ");
            
            break;
        case "orange":
        System.out.println("round fruit");
        default:
        System.out.println("please enter a valid fruit ");
            
    }
        
    }
}