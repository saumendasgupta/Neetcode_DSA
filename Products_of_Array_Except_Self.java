/****
  Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
****/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int res[] = new int[nums.length];
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        for(int i=1;i<nums.length;i++){
            arr1[i] = arr1[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>0;i--){
            arr2[i-1] = arr2[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i] = arr1[i]*arr2[i];
        }
        return res;
    }
}  
