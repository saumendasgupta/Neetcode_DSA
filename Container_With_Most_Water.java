/************
You are given an integer array heights where heights[i] represents the height of the (i)th bar.

You may choose any two bars to form a container. Return the maximum amount of water a container can store.
*************/

class Solution {
    public int maxArea(int[] heights) {
        // formula : min(heights[left],heights[right])*(right-left)
        // water can be reach till min height of any side
        //so move the pointer of min side in HOPE to get a max area
        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right){
            int area = Math.min(heights[left],heights[right]) * (right-left);
            maxArea = Math.max(area,maxArea);
            if(heights[left]<heights[right]){// move the pointer where height is less in HOPE to get better area
               left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
