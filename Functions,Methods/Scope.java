 public class Scope {
    public static void main(String[] args) {
     int a =10;
     int b =20;
     {
        a =100;
        System.out.println(a);
        int c = 99;
        //values initialised in this block ,will remain in block
     }
     
     

    }
    static void random( int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
 }