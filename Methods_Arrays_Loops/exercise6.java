package Methods_Arrays_Loops;

public class exercise6 {
    public static int sumArray(int[] nums){
        int sum =0;
        for(int n: nums){
            sum=sum+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        System.out.println(sumArray(nums1));
    }

    }
  

        
    
