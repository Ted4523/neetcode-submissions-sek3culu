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
        hs.insert(0);
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target) return true;
            unordered_set<int> next = hs;
            for(int n:hs){
                if(n+nums[i]==target) return true;
                next.insert(n+nums[i]);
            }
            hs = move(next);

        }

        return false;
    }
};
