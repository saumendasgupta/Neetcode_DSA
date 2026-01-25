class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        HashMap<Character,Integer> map = new HashMap();
        int[] base = new int[26];
        for(int i=0;i<s1.length();i++){
            int index = s1.charAt(i)-'a';
            base[index] = base[index]+1;
        }
        int start = 0;
        int end = 0;
        while(end<s2.length()){
            //cut the chunk
            end = start+s1.length();
            int[] compare = new int[26];
            String ss = s2.substring(start,end);
            for(int i=0;i<ss.length();i++){
                int index = ss.charAt(i)-'a';
                compare[index] = compare[index]+1;
            }
            if(Arrays.equals(compare,base)){
                return true;
            }else{
                start = start+1;
            }
        } 
        return false;
    }
}
