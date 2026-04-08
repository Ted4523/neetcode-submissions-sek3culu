class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> hm;
        for(int n:nums){
            hm[n]++;
        }
        auto cmp = [](const pair<int,int>& a, const pair<int,int>& b){
            return a.second<b.second;
        };
        priority_queue<pair<int,int>,vector<pair<int,int>>, decltype(cmp)> pq;
        for(const auto& kv:hm){
            pq.push(kv);
        }
        vector<int> res;
        res.reserve(k);
        for(int i=k;i>0;i--){
            res.push_back(pq.top().first);
            pq.pop();
        }
        return res;

    }
};
