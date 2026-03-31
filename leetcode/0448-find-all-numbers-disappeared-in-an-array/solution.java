class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> re=new HashSet<>();
        List<Integer> fin=new ArrayList<>();

        for(int j:nums){
            re.add(j);
        }

        for(int i=1;i<=nums.length;i++){
            if(!re.contains(i)){
                fin.add(i);
            }
        }
        return fin;
        
    }
}
