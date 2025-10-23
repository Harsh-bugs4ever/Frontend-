class Calculator{
    public int add(int num1,int num2, int num3){
        return num1+num2+num3;
    }
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
}
public class Overloading{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(4,5);
        System.out.println(r1);
        double r2 = obj.add(4.5,3.6);
        System.out.println(r2);
        int r3 = obj.add(4,6,6);
        System.out.println(r3);
        
    }
}