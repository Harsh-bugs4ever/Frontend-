import java.util.Scanner;
public class Starpattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of rows"); // taking number of rows from user
      int rows = sc.nextInt();
      int i =1;
       while(i<=rows) { //using int i= 1 to intialise it from 1
        int j =1;
         while ((j<=i)) {
            System.out.print("* ");
            j++;
         }
         System.out.println();
        i++;
        
       }
      
    }
}
