class mobile
{
 int price;
 static String name;
 String brand;

 public void show()
 {
    System.out.println(brand + ":" + name + ":" + price+":");
 }
 public mobile()
 {
    brand = "apple";
    price = 10000;
    System.out.println("in constructor");

 }
 static//intialise the static variable the static variable wil be called only once irrespective of how many times you will create object
 {
    name = "phone";
    System.out.println("in static block");
 }
}

public class DemoStaticBlock {
    public static void main(String a[]) throws ClassNotFoundException{ 
        //if you dont creeate the object it will not load the class including both static block and constructor class so to calling we need a class function
        Class.forName("mobile");//static block will run even if you dont create an object and it will run only once because in JVM class loads only once
        //constructor runs multiple times as many time you create the object
    }
    
}
