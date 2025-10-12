public class while_loop {
    public static void main(String[] args) {
      /*   int i = 1;

      while(i<=4) // check the value of i and increment and will check for the condition i.e i++ after a ti,me i++ will become 4 so it will get false and quit itself
      {
         System.out.println("hii "+ i);
         i++; 
   }*/
     int i = 1;
      while(i<=5){
        System.out.println("HEllo " + i);
        int j = 1;
         while(j<=6){
            System.out.println("kyu hai ye");
            j++;
         }
        i++;
      }
      System.out.println("bye"+ i);
    }
}
