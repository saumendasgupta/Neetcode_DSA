/********
  Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
  *****/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,ArrayList<String>> map = new HashMap();
        for(int i =0;i<strs.length;i++){
            char[] element = strs[i].toCharArray();
            Arrays.sort(element);
            //Mental model: Find the signature from the string to make a key
            // Here signatutre is string itself after sort
            // and then store sorted string as key and actual string as value
            String key = String.valueOf(element);
            if(!map.containsKey(key)){
                ArrayList<String> list = new ArrayList();
                list.add(strs[i]);
                map.put(key,list);
            } else {
                ArrayList list = map.get(key);
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
