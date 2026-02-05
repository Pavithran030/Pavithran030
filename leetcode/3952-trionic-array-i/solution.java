class Solution {
    public boolean isTrionic(int[] nums) {

        int a =nums.length;
        int i=1;

        while(i < a && nums[i-1]<nums[i]){
            i++;
        }
        int incr1=i-1;

        while(i < a && nums[i-1]>nums[i]){
            i++;
        }
        int decr=i-1;

        while(i < a && nums[i-1]<nums[i]){
            i++;
        }
        int incr2=i-1;

        if(incr1 != 0 && incr1 != decr && decr != incr2 && incr2 == a-1) return true;
        return false;
        
    }
}
