public class switch_statement {
    public static void main(String[] args) {
        /*int num = 2;
        if(num==2)
         System.out.println("monday");
        else if(num==1)
         System.out.println("Tuesday");
        else if (num==3)
         System.out.println("Wednesday");
        else if (num==4)
         System.out.println("Thursday");
        else if (num==5)
         System.out.println("Friday");
        else if (num==6)
         System.out.println("Saturday");
        else
         System.out.println("Sunday"); */
         //we can use switch statement
         int num = 1;
        switch(num){
            case 1:
             System.out.println("monday");
             break;
            case 2:
             System.out.println("Tuesday");
             break;
            case 3:
             System.out.println("Wednesday");
             break;
            case 4:
             System.out.println("Thursday");
             break;
            case 5:
             System.out.println("Friday");
             break;
            case 6:
             System.out.println("Saturday");
             break;
            case 7:
             System.out.println("Sunday");
             break;
            default:
             System.out.println("Plelase enter a valid numner");
        }
    }
}
