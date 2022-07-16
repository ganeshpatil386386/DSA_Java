import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));

        int sum = nums[1] + nums[3];
        

        if(sum%2==0){
            System.out.println(sum);
        }else{
            System.out.println("bug");
        }

        arr1(nums);
        System.out.println(Arrays.toString(nums));

        int [][] num1 =  {
            {1,2,3},
            {2,3,4},
            {3,4,5}
            

        };
        System.out.println(num1[0][1]);

    }


    
    static void arr1 (int [] arr){
        arr[0]=99;
    }               
}
