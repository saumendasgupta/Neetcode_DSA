/************
  Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
  ******************/

class Solution {
    public boolean isPalindrome(String s) {
        String sb = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int startIdx = 0;
        int endIdx = sb.length()-1;
        while(startIdx<endIdx){
            //System.out.println("start "+sb.charAt(startIdx));
            //System.out.println("end "+sb.charAt(endIdx));
            if(sb.charAt(startIdx)!=sb.charAt(endIdx)){
                return false;
            } else{
                startIdx++;
                endIdx--;
            }
        }
        return true;
    }
}
