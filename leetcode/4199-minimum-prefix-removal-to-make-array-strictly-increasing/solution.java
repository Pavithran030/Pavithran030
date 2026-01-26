class Solution {
    public int minimumPrefixLength(int[] nums) {
        int count=nums.length-1;
        while(count>0 && nums[count]>nums[count-1]){
            count-=1;
        }
        
        return count;
        
    }
}
