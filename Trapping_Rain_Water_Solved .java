/*************
  You are given an array of non-negative integers height which represent an elevation map. Each value height[i] represents the height of a bar, which has a width of 1.

Return the maximum area of water that can be trapped between the bars.
  ********************/
class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int water = 0;
        while(left<right){
            //formula water[i]=min(maxLeft,maxRight) - height[i]
            maxLeft=Math.max(maxLeft,height[left]);
            maxRight=Math.max(maxRight,height[right]);
            if(maxLeft<=maxRight){
                water = water+(maxLeft - height[left]);
                left++;
            } else {
                water = water + (maxRight - height[right]);
                right--;
            }
        }
        return water;
    }
}
