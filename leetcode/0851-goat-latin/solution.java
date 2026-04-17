class Solution {
    public String toGoatLatin(String sentence) {
        String[] store = sentence.split(" ");
        StringBuilder re=new StringBuilder();

        for(int i=0;i<store.length;i++){
            String word=store[i];

            String check="aeiouAEIOU";

            if(check.indexOf(word.charAt(0)) !=-1){
                word+="ma";
            }
            else{
                word=word.substring(1) + word.charAt(0) + "ma";
            }

            for(int j=0;j<=i;j++){
                word+='a';
            }
            re.append(word);

            if(i!=store.length-1){
                re.append(" ");
            }

        }
        return re.toString();
    }
}
