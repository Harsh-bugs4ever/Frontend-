class mobile{
int price;
static String name;
String brand;

 public void show(){
    System.out.println(brand + ":" + name + ":" + price+":");
 }
}


public class Demostattic {
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        mobile obj2 = new mobile();
        mobile obj3 = new mobile();

        obj1.brand = "Samsung";
        obj1.price = 10000;
        mobile.name = "Smartphone";

        obj2.brand = "Apple";
        obj2.price = 999999;
       mobile.name = "mm";

        obj3.brand = "Nothing 2a";
        obj3.price = 22999;
        mobile.name = "Smartphone";//we can use  class to call static variable

        mobile.name = "Smartphone";//since i have changed the data type as static so now every object data type name will be same such as name is smartphone for all objects since i have putted in the last section

        obj1.show();
        obj2.show();
        obj3.show();
        
    }
    
}
