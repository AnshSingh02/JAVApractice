import java.util.*;
public class invertednumberpyramid{
public static void ivereted_half_pyramid_withNumbers(int n){
    
    

    for(int i =1 ; i<=n ; i++){
        for(int j =1; j<=n-i+1 ; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void main(String args []) {
   ivereted_half_pyramid_withNumbers(5);
}
}