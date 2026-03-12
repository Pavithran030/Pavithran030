class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] re={-1,-1};

        int left=binSearch(nums,target,true);
        int right=binSearch(nums,target,false);
        re[0]=left;
        re[1]=right;
        return re;
    }

    private int binSearch(int[] nums,int target,boolean flag){

        Arrays.sort(nums);

        int size=nums.length;
        int left=0,right=size-1;
        int indx=-1;
        while(left<=right){

            int mid=(left+right)/2;
            

            if(nums[mid]<target) left=mid+1;
            else if(nums[mid]>target) right=mid-1;

            else{
                indx=mid;  
                if(flag) right = mid-1;
                else left = mid+1;
            }
        }
        return indx;
    }
}

