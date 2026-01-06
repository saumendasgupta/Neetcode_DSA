/**********
  Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.
*********/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return   map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                    .limit(k)
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .toArray();

        
    }
}
