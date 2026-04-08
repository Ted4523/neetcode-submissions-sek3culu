class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> hm;
        for(string s:strs){
            string sorted = s;
            sort(sorted.begin(),sorted.end());
            hm[sorted].emplace_back(s);
        }
        vector<vector<string>> res;
        for(const auto& pair: hm){
            res.emplace_back(pair.second);
        }

        return res;
    }
};
