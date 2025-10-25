public class Array{
    public static void main(String[] args) {
     int nums[] ={1,7,6,5}; //storing values in an array
     nums[1]= 4; // changing the value of orray in first postion
     System.out.println(nums[1]); // printing the value of array at 1st postion
     int arr[] = new int[4];//created 4 empty boxes
     arr[0] = 0;
     arr[1] = 2;
     arr[2] = 4;
     arr[3] = 6;//storing the value at 0th position
     System.out.println(arr[0]);
     //to print all array element we can use loop
     int i=0;
     for(i=0; i<=3; i++){
        System.out.println(nums[i]);
     }
    }
}