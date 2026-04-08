class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;
        int size = 0;
        while(index<str.length()) {
            if(str.charAt(index)=='#') {
                res.add(str.substring(++index, index+size));
                index = index+size;
                size = 0;
                continue;
            }
    //        System.out.println(str.charAt(index));
            size = size * 10 + (str.charAt(index)-'0');

            index++;
        }

        return res;

    }
}
