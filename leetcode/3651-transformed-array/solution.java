class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int size=nums.length;
        int[] re=new int[size];

        for(int i=0;i<size;i++){
            if(nums[i]!=0)
                re[i]=nums[((i+nums[i]) % size + size)%size];
        }
        return re;
        
    }
}
