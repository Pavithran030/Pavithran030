class Solution {
    public boolean detectCapitalUse(String word) {

        int full=0;
        int no=0;
        int first=0;

        int si=word.length();
        char c1=word.charAt(0);
        if(c1>='A' && c1<='Z') first++;
        for(int i=0;i<si;i++){
            char c=word.charAt(i);
            
            if(c>='A' && c<='Z') full++;
            else if(c>='a' && c<='z') no++;
        }

        if(full==si) return true;
        else if(no==si) return true;
        else if(first==1 && no==si-1) return true;
        else return false;

        
    }
}
