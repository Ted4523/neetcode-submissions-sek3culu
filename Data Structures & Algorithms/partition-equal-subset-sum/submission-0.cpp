class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int sum = 0;
        for (int n:nums){
            sum+=n;
        }
        if(sum%2!=0) return false;
        int target = sum/2;
        unordered_set<int> hs;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target) return true;
            for(int n:hs){
                if(n+nums[i]==target) return true;
                hs.insert(n+nums[i]);
            }
            hs.insert(nums[i]);

        }

        return false;
    }
};
