class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(char c:s){
            if(st.empty()) st.push(c);
            else if(c==')'){
                if(st.top()!='(') return false;
                st.pop();
            }else if(c==']'){
                if(st.top()!='[') return false;
                st.pop();
            }else if(c=='}'){
                if(st.top()!='{') return false;
                st.pop();
            }else{
                st.push(c);
            }
        }

        return st.empty()?true:false;
    }
};
