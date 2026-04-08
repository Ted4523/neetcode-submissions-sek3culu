class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1) return s.length();
        Map<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 1;
        while(right<s.length()){
            char ch = s.charAt(right);

            if(hm.getOrDefault(ch,-1)>=left){
                left = hm.getOrDefault(ch,-1) + 1;
            }
            max = Math.max(max,right-left+1);
            hm.put(ch,right);
            right++;
        }
        return max;
    }
}
