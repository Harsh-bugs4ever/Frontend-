
class student{
    int rollno;
    String name;
    int marks;
}

public class ArrayStringsint {
    public static void main(String[]args){
        student S1 = new student();
        S1.rollno = 2;
        S1.name = "harsh";
        S1.marks = 20;

        student S2 = new student();
        S2.rollno = 3;
        S2.name = "Alok";
        S2.marks = 00;

        student S3 = new student();
        S3.rollno = 16;
        S3.name = "Nitu";
        S3.marks = 25;
//agar string aur int sab values store karni hain ek arraye me to create a  class and make how many student you want to create and then store them in array by creating anew objects as students and storing the S!,S2,S3 in them and sice hume nahi pata kya hai students ka numbers so use students.length now print ke time pe use Students[i],name + for concatenation and then students[i].roll and same for marks
        student students[] = new student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].name+students[i].rollno+students[i].marks);

        }
       

    }  
}
 
