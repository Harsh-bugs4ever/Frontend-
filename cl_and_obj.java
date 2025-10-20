class calculator{
    int a;
    public int add(int n1 , int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
public class cl_and_obj{
    public static void main(String[] args) {
        int num1=6;
        int num2=4;
        calculator calc = new calculator(); //creation of an object claas name variable name = new then object you want to create
        int result = calc.add(4,5);
        //int result = num1+num2;
        System.out.println(result);
    }

}