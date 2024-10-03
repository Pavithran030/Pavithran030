int majorityElement(int* nums, int numsSize) {
    int count=0;
    int  can=-1;
    for(int i=0;i<numsSize;i++)
    {
        if(count==0)
        {
            can=nums[i];
            count=1;
        }
        else
        {
            if(can==nums[i])
                count++;
            else
                count--;
            
        }
    }
    int co=0;
    for(int i=0;i<numsSize;i++)
    {
        if(can==nums[i])
            co++;
    }
    if(co>numsSize/2)
        return can;
    else
        return -1;    
}
