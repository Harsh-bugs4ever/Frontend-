
public class Stringbuffer {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Harsh");
        System.out.println(sb.capacity());//iot gives me buffer to reduce realloaction of string
        System.out.println(sb.length());
        sb.append("Singh");
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.ensureCapacity(100);//it will ensure the minimum capacity to be 100
    }
}
