public class exercise1{
    
   public int[] Solution(int[] nums, int target){
       for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){

                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                
                }
            }
        }
        return new int[]{};
    } 
    
    
 

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

         exercise1 obj = new exercise1();
         int[] ans = obj.Solution(nums, target) ;

     System.out.println(ans[]+" , "+ans[1]);
                


            }
        
 
    
}

    