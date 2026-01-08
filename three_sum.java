/******* 3 SUM*********/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	 Arrays.sort(nums);
	 List<List<Integer>> result = new ArrayList();
	 //int i = 0;
	 Set<Integer> set = new HashSet();
	 for (int i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] == nums[i - 1]) continue;
		 int startIdx = i;
		 int left=startIdx+1;
		 int right=nums.length-1;
		 int target = 0-(nums[startIdx]);
		 
		 //System.out.println("target is "+target);
		 while(left<right){
		     System.out.println("left "+left+" right "+right+" target "+target);
			 if((nums[left]+nums[right])==target){
			     System.out.println("same");
				 List<Integer> res = new ArrayList();
				 res.add(nums[startIdx]);
				 res.add(nums[left]);
				 res.add(nums[right]);
				 System.out.println(" --"+res);
				 result.add(res);
				 
				 left++;
				 right--;while (left < right && nums[left] == nums[left - 1]) left++;
while (left < right && nums[right] == nums[right + 1]) right--;

			 }else if(nums[left]+nums[right]<target){
			     System.out.println("less");
				  left++;
			 }
			 else if(nums[left]+nums[right]>target){
			     System.out.println("greater");
				  right--;
			 }
		 }
			//i++;
			System.out.println("I is "+i);
		}
        return result;
    }
}
