class Solution {
public:
    bool hasAlternatingBits(int n) {

        int pre=-1;

        while(n!=0){
            int remain = n % 2;
            
            if(remain==pre) return false;
            pre=remain;
            n/=2;
        }
        return true;
        
    }
};
