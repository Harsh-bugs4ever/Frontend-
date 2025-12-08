//not all the data are Accesable so we need to creat our dat private so now that variable is accesible to only that class 
//Every time you make a instance variable make it private
//you can access this data by using methods

class Human{
    private int age = 24;
    private String name = "harsh";
    
    public int getAge()
    {
        return age; //you can acces this variavle in the method of same class
    }
    public void setAge(int a){
        age = a;//whatever value ill assign now to objecr it will get assigned to age and then it will get update to private age variable so now if ypu print age it will give you new updated age which you set on setAge()
    }
    public String getName(){
        return name; //in same way you can access the name as well
    }
    public void setName(String n){
        name = n;
    }


}

public class DemoEncapsulation {
    public static void main(String a[]){
        Human h1 = new Human();
        h1.setAge(19);
        h1.setName("harsh");
        System.out.println(h1.getName()+":"+h1.getAge());
    }
    
}
