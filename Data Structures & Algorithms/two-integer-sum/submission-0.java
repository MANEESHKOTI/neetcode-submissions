class Solution {
    public int find(int[]nums,int n,int m){
            for(int i = 0 ; i < nums.length ; i++){
                
                if(nums[i]==n && i!=m){
                    return i;
                }
            }
            return -1;
        }
    public int[] twoSum(int[] nums, int target) {
        int finder = 0;
        int[] num1 = new int[2]; 
        for(int i = 0 ; i < nums.length; i ++){
            finder = find(nums,target-nums[i],i);
            if(finder!= -1){
                num1[0] = i;
                num1[1] = finder;
                return num1;
            }
        } return num1;
    }
}
