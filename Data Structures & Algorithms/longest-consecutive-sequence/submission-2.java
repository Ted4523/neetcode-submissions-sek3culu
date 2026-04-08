class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        Set<Integer> hs = new HashSet<>();

        for(int n:nums){
            hs.add(n);
        }

        int max = 1;
        for(int c:hs){
            if(hs.contains(c-1)) continue;
            int s = 1;
            while(hs.contains(c+1)){
                max = Math.max(max,++s);
                c++;
            }
        }

        return max;
    }
}
