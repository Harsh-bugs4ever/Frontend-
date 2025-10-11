public class Conversion_and_casting {
    public static void main(String [] args){
        float y =5.6f;
        int x= (int)y;
        int a = 160;
        byte k = (byte)a; // type casting
        System.out.println(k);
        System.out.println(x);
        byte j =25;
        byte n=2;
        int result = (j*n);
        System.out.println(result); // here the byte is promoted to int
    }
}
