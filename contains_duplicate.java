/*Contains Duplicate
  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false */

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            } else{
                set.add(num);
            }
        }
        return false;

    }
}
