class Solution {
public:

    string encode(vector<string>& strs) {
        string msg = "";
        for(const string& s:strs){
            msg += to_string(s.size()) + "#" + s;
        }
        cout<<msg;
        return msg;
    }

    vector<string> decode(string s) {
        vector<string> res;
        int length = 0;
        int idx = 0;
        while(idx<s.length()){
            if(s[idx]=='#'){
                res.emplace_back(s.substr(++idx,length));
                idx+=length;
                length = 0;
            }
            length *= 10;
            length += s[idx] - '0';
            idx++;
        }

        return res;
    }
};
