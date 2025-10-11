public class logical_operators {
    public static void main(String[] args) {
       int x = 7;
       int y = 5;
       int a = 5;
       int b = 9;
       boolean result = x > y && a>b; // and operator
       System.out.println(result); 
       boolean result2 = x>y || a>b; // OR operator
       System.out.println(result2);
       boolean result3 = x>y ;
       System.out.println(!result3); //not operator
    }
}
