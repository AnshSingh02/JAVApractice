import java.util.Scanner;
public class NestedSwitch{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department =in.next();
        switch (empID) {
            case 1:
            System.out.println("rahul");
                break;
                case 2:
                System.out.println("rana");
                    break;    
                    case 3:
                    System.out.println("Emp number 3");
                    switch (department){
                    case "IT":
                    System.out.println("IT dept");
                    break;
                    case"Management":
                    System.out.println("management dept");
                    break;
                    default:
                    System.out.println("No department entered");
                    }                
            
            default:
            System.out.println("enter correct empID");
        }
    

    }
}