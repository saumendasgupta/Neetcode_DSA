class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        int ret = -1;
        for(int num:nums){
            if(map.getOrDefault(num,0)==0){
                map.put(num, map.getOrDefault(num,0)+1);
            }else{
                ret= num;
            }
        }
        return ret;
    }
}
