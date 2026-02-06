class Solution {
    public int minRemoval(int[] nums, int k) {

        int size=nums.length;
        int maxs=0;
        int l=0;

        Arrays.sort(nums);

        for(int i=0;i<size;i++){

            while(nums[i] > (long) k*nums[l]){
                l++;
            }
            maxs=Math.max(maxs,i-l+1);
        }

        return size-maxs;
        
    }
}
