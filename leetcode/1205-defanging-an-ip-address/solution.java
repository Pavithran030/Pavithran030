class Solution {
    public String defangIPaddr(String address) {
        // String re="";
        // for(char c:address){
        //     if(c!='.'){
        //         re+=c;
        //     }
        //     else {
        //         re+="[.]";
        //     }
        // }
    return address.replace(".","[.]"); 
    }
}
