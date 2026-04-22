class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List <String> re = new ArrayList<>();

        for(String q:queries){
            for(String d:dictionary){
                int diff=0;

                for(int i=0;i<d.length();i++){
                    if(q.charAt(i)!=d.charAt(i)){
                        diff++;
                    }

                    if(diff>2) break;
                }
                if(diff<=2){
                    re.add(q);
                    break;
                }
            }
        }
        return re;


        
    }
}
