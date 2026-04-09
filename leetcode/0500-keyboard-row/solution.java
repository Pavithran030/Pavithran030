class Solution {
    public String[] findWords(String[] words) {

        String r1= "qwertyuiop";
        String r2= "asdfghjkl";
        String r3= "zxcvbnm";
        List<String> re=new ArrayList<>();
        
        for(String s:words){
            String row="";
            String s1=s.toLowerCase();
            if(r1.contains("" + s1.charAt(0))) row=r1;
            else if(r2.contains("" + s1.charAt(0))) row=r2;
            else row=r3;

            boolean check=true;

            for(char c:s1.toCharArray()){
                if(!row.contains(""+c)){
                    check=false;
                    break;
                }
            }

            if(check) re.add(s);
        }
        // String[] re1 = re.toArray(new String[0]);
        return re.toArray(new String[0]);
        
    }
}
