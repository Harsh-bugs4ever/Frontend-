class A{
    public A() //Every construcor have a super class even if we cant see it super(); it is created by jdk we cant see it
    {
        super();
        System.out.println("in A");
    }
    public A(int a)//here as well super();
    {
        super();
        System.out.println("in A int");
    }
}
class B extends A
{
    public B() //here as well super();
    {
        super();
        System.out.println("in B");
    }
    public B(int a) ///here as well super();
    {
        super();
        System.out.println("in B int");
    }
}

public class DemoConstructor {
    public static void main(String[] args) {
        B obj = new B();
    }
    
}
//so as i explaine above ki super class already created hai without any parameter in it so wo call Karega super class ke default wale constructoer call karega 
//but agar maine super(int n); to ye  dono super class ke parameter wale ka constructor call karega
