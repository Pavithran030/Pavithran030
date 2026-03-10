class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> hs=new HashMap<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(hs.containsKey(nums[i]))  {
                if(Math.abs(i-hs.get(nums[i])) <=k ){
                    return true;
                }
            }
            hs.put(nums[i],i);
        }
    return false;
        
    }
}
