import java.util.*;
public class calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     System.out.println("Enter the first number:");
     int num1 = sc.nextInt();

     System.out.println("Enter the second numbe:");
     int num2 = sc.nextInt();
    
     System.out.println("Enter your operation:");
     System.out.println("For addition: +");
     System.out.println("For substraction: -");
     System.out.println("For multiplication: *");
     System.out.println("For division: /");
     char operator = sc.next().charAt(0);
     int result; //declaring the result type ek baar declare kar diya to baaar baar nahi karna hota aur neeche bhi agr int res kar diya to dusre switch me direct res se karo na ki int res
     switch(operator){
        case '+':
         result = num1+num2;
         System.out.println(num1 +"+" +num2+":"+result);
         break;
        case '-':
         result = num1-num2;
         System.out.println(num1 +"-" +num2+":"+result);
         break;

        case '*':
         result = num1*num2;
         System.out.println(num1 +"-" +num2+":"+result);
         break;
        case '/':
         if(num2==0)
          System.out.println("Enter the non zero number");
         else{
            result = num1/num2;
           System.out.println(num1 +"/" +num2+":"+result);
         }
        break;
        default:
         System.out.println("Choose valid operator:");
     }
    sc.close();
    }
}
