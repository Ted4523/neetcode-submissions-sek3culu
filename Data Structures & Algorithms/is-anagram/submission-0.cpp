class Solution {
public:
    bool isAnagram(string s, string t) {
        int letters[26] = {};
        for(char ch : s){
            letters[ch-'a']++;
        }
        for(char ch : t){
            letters[ch-'a']--;
        }
        
        for(int n:letters){
            if(n!=0) return false;
        }

        return true;
    }
};
