public class D_Array {
    public static void main(String[] args) {
        // int nums [] [] [] = new int [4] [2] [2];
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<2; j++){
        //         for(int k=0; k<2; k++){
        //             nums[i][j][k]=(int)(Math.random()*10);
        //             System.out.print(k+" ");
        //         }
        //     System.out.println();
        //     }
        // System.out.println();
        // }
        int nums[][][]=new int [4][5][];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = new int[(int)(Math.random() * 5) + 1]; // random length 1-5
            }
        }

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                for(int k=0; k<nums[i][j].length; k++){
                    nums[i][j][k]=(int)(Math.random()*10);
                }
            }
        }
        for(int n[][] : nums){
            for(int m[]:n){
                for(int o:m){
                    System.out.print(o+" ");
                }
            System.out.println();
            }
        System.out.println();    
        }
    }
}
