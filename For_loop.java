import java.util.*;
public class For_loop {
    public static void main(String[] args) {
       /*  //loops - while loop, do while loop , for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        for(int i=0; i<=rows; i++){  
        for(int j=0; j<i; j++){
         System.out.print("*");
        }
        System.out.println();
    }*/
     for (int i = 1; i<=7; i++){
        System.out.println("Day "+ i);
        for(int j=1; j<=9; j++)
        {
            System.out.println(""+(j+8)+" to "+(j+9));
        }
     }
    }
}
