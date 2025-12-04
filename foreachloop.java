class student{
    int rollno;
    String name;
    int marks;
}


   

public class foreachloop {
    public static void main(String[]args){
    // int nums[] = new int[4];
    // nums[0] = 1;
    // nums[1] = 2;
    // nums[2] = 3; 
    // for(int n : nums){
    //     System.out.println(n);
    // }

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

        student students[] = new student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;
        for(student s : students){
            System.out.println(s.name+":"+s.rollno+":"+s.marks);

        }
    }
}

