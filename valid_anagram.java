/*Valid Anagram*/
/*Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArray= new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            sArray[index]=sArray[index]+1;
        }
        for(int i=0;i<t.length();i++){
            int index = t.charAt(i)-'a';
            sArray[index]=sArray[index]-1;
        }
        return Arrays.stream(sArray).allMatch(element->element==0);
    }
}
