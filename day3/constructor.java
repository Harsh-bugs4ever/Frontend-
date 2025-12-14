//constructor is same as method but the diference is it doesn't have any return type
//Every time you will create a object it will call the constructor
//you can assign the values in constructor and print something but avoid assigning values in class
//Parametrized constructor where we pass the parameter and we can use thos paarmeter constructor in object 
//for constrcutor name should match exactly with class
class college {
    private int Since = 1987;
    private String name = "SLRTCE";

    // Default constructor
    public college() {
        System.out.println("You're into SLRTCE college");
    }

    // Parameterized constructor (NO this keyword)
    public college(int year, String collegeName) {
        Since = year;          // setting instance variable
        name = collegeName;    
    }

    // Getter for Since
    public int getSince() {
        return Since;
    }

    // Setter for Since
    public void setSince(int s) {
        Since = s;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }
}

public class constructor {
    public static void main(String[] args) {

        college c1 = new college();                 // default constructor
        college c2 = new college(2003, "VJTI");     // parameterized constructor

        c1.setSince(1969);      
        c1.setName("KJ Somaiya");

        System.out.println(c1.getName() + " : " + c1.getSince());
        System.out.println(c2.getName() + " : " + c2.getSince());
    }
}
