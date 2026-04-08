class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }

            int target = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]>target){
                    right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    while(left<nums.length-1 && nums[left]==nums[left-1]){
                        left++;
                    }
                }
            }

        }

        return res;
    }
}
