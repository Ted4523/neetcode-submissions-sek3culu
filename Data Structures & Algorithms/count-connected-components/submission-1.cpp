class Solution {
public:
    int countComponents(int n, vector<vector<int>>& edges) {
        vector<bool> seen(n,false);

        int count = 0;
        vector<vector<int>> adj(n);
        for(const vector<int>& e:edges){
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
        }
        for(int i=0;i<n;i++){
            if(seen[i]) continue;
            seen[i] = true;
            queue<int> connected;
            connected.push(i);
            while(connected.size()>0){
                int node = connected.front();
                connected.pop();
                for(int x: adj[node]){
                    if(!seen[x]) {
                        seen[x] = true;
                        connected.push(x);
                    }

                }
            }
            count++;
        }
        return count;

    }
};
