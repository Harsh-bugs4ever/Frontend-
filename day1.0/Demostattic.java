class mobile{
int price;
static String name;
String brand;

 public void show(){
    System.out.println(brand + ":" + name + ":" + price+":");
 }
 public static void show1(){
    System.out.println(name);//i can call names using static variable constructor but i cannot call anything apart from that because brand and price is not static while string is so i can call name in static constructor block
 }
}


public class Demostattic {
    public static void main(String[] args){//thats why im using static main so i can call main class without creating the object 
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
        obj1.show1();//here im using object to call show1 but thats not a proper method i can use 
        mobile.show1();
        
    }
    
}
