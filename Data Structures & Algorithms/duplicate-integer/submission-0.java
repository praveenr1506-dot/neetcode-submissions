class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupnum=new HashSet<>();
        for(int num: nums){
            if (dupnum.contains(num)){
                return true;
            }
            else
            dupnum.add(num);
        }
        return false;
        
    }
}