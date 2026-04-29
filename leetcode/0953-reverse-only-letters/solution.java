class Solution {
    public String reverseOnlyLetters(String s) {

        char[] store=s.toCharArray();


        int l=0,r=s.length()-1;

        while(l<r){

            if(!Character.isLetter(store[l])) l++;
            else if (!Character.isLetter(store[r])) r--;
            else{
                char temp =store[l];
                store[l]=store[r];
                store[r]=temp;
                l++;
                r--;
            }
        }
        return new String(store);
    }
}
