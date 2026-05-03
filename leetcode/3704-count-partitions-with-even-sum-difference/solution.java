class Solution {
    public int countPartitions(int[] nums) {

        int count =0;

        for(int i:nums){
            count+=i;
        }
        if(count % 2 !=0) return 0;
        else return nums.length-1;
    }
}
