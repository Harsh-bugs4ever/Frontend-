class Computer
{
    public void playMusic(){
      System.out.println("Music Playing..");//method1
    }
    public String getMeAPen(int cost){
          if (cost >= 10)
            return "Pen";
        else
            return "Nothing";//method2
    }
}
public class Method{
    public static void main(String[] args) {
        //how can we call a method
        Computer obj= new Computer(); //creating a new on=bject of computer
        obj.playMusic();//Calling method one with void
        String st= obj.getMeAPen(10);//Callingmethod 2 without void that means we have to give some value since it was a pen so i have given a string variable to call pen from method 2
        System.out.println(st);//printing the pen 
        
    }
}