class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ans;
        vector<int> subset;
        dfs(0,subset,nums,ans);
        return ans;
    }

    void dfs(int i, vector<int> subset, vector<int>& nums, vector<vector<int>>& ans){
        if(i>=nums.size()) {
            ans.push_back(subset);
            return;
        }

        subset.push_back(nums[i]);
        dfs(i+1,subset,nums,ans);
        subset.pop_back();
        dfs(i+1,subset,nums,ans);
    }

    
};
