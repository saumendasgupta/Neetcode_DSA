class Solution {
    public int search(int[] nums, int target) {
       int mid ;
       int start = 0;
       int end = nums.length-1;
       System.out.println("target "+target);
       while(start<=end){
          mid = start+(end-start)/2;
         System.out.println("mid "+mid);
        if(nums[mid]==target){
           return mid;
        }
        if(nums[mid]<target){
                start = mid+1;
        }else{
                end = mid-1;
        }  
       }
       return -1; 
    }
}
