class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> re=new HashSet<>();
        List<Integer> inter=new ArrayList<>();

        for(int i:nums1){
            if(!re.contains(i)) re.add(i);
        }
        
        for(int j:nums2){
            if(re.contains(j)) {
                inter.add(j);
                re.remove(j);
            }
        }
        int[] fin=new int[inter.size()];
        for(int i=0;i<inter.size();i++){
            fin[i]=inter.get(i);
        }
        return fin;
    }
}
