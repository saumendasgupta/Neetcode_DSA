class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxWindowSize=-1;
        int start=0;
        int maxFreq = 0;
        for(int end=0;end<s.length();end++){
            
            int index=s.charAt(end)-'A';
            freq[index]=freq[index]+1;
            //find max freq
            maxFreq = Math.max(maxFreq, freq[index]);
            int windowSize = (end-start)+1;
            
                while(windowSize-maxFreq>k){
                    freq[s.charAt(start)-'A']--;
                    start++;
                    windowSize = end - start + 1;
                }
            maxWindowSize = Math.max(maxWindowSize, windowSize);
        }

        return maxWindowSize;
    }
}
