class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> hm;
        for(const string& s: strs){
            vector<int> count(26,0);
            for(char ch:s){
                count[ch-'a']++;
            }
            string k = "";
            for(const int& c: count){
                k += to_string(c)+"#";
            }
            hm[k].push_back(s);

        }
        vector<vector<string>> res;
        res.reserve(hm.size());
        for(const auto& pair:hm){
            res.push_back(pair.second);
        }
        return res;
    
    }
};
