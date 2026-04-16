class Solution {
    public String reverseWords(String s) {
        String[] store =s.split(" ");
        StringBuilder re=new StringBuilder();

        for(String s1:store){
            StringBuilder st1=new StringBuilder(s1);
            re.append(st1.reverse()).append(' ');
        }
        return re.toString().trim();
    }
}
