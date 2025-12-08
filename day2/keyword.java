// if we set age as instance and local variable then it will be difficult to get updated value because age is assigning value to itslef so for this we need to do like we need to mention that which is instance variable by using this keyword 
class Human1{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age; //this refers to the object which is calling setAge not the instance one
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class keyword {
    public static void main(String[] args) {
        Human1 obj1 = new Human1();
        obj1.setName("Nikhil");
        obj1.setAge(20);
       System.out.println(obj1.getName()+":"+obj1.getAge());
    }
    
}
