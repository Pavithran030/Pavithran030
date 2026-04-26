class Solution {
    public void sortColors(int[] nums) {
        int red=0,wh=0,blue=0;

        for(int i=0;i<nums.length;i++){
            int test=nums[i];
            if(test==0) red++;
            else if(test==1) wh++;
            else blue++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<red) nums[i]=0;
            else if (i<red + wh) nums[i]=1;
            else nums[i]=2;
        }
    }
}
