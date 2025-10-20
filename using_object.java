import java.util.Scanner;
class calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
public int subtract(int num1, int num2){
    return num1-num2;
}
public int multiply(int num1, int num2){
    return num1*num2;
}
public int division(int num1, int num2){
    if(num2==0){
        throw new ArithmeticException("Cannot be divided by zero");
    }
    return num1/num2;
}
}
public class using_object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number:");
        int num2 = sc.nextInt();
        calculator calc = new calculator();
        System.out.println("The addition of numbers are:"+ calc.add(num1,num2));
        System.out.println("The Substraction of numbers are:"+ calc.subtract(num1,num2));
        System.out.println("The multiplication of numbers are:"+ calc.multiply(num1,num2));
        System.out.println("The division of numbers are:"+ calc.division(num1,num2));{
     sc.close();
        }

    }
}
