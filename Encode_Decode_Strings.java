/******
  Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

string encode(vector<string> strs) {
    // ... your code
    return encoded_string;
}
Machine 2 (receiver) has the function:

vector<string> decode(string s) {
    //... your code
    return strs;
}
So Machine 1 does:

string encoded_string = encode(strs);
and Machine 2 does:

vector<string> strs2 = decode(encoded_string);
strs2 in Machine 2 should be the same as strs in Machine 1.

Implement the encode and decode methods.

Example 1:

Input: dummy_input = ["Hello","World"]

Output: ["Hello","World"]

Explanation:
Machine 1:
Codec encoder = new Codec();
String msg = encoder.encode(strs);
Machine 1 ---msg---> Machine 2

Machine 2:
Codec decoder = new Codec();
String[] strs = decoder.decode(msg);
Example 2:

Input: dummy_input = [""]

Output: [""]
*****************************/
/********** Here the main formula is [length]+[#]+[string] ****/
class Solution{
    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer();
         for(int i=0;i<strs.size();i++){
            //get the length to use the formula [length]+[#]+[string]
            int len=strs.get(i).length();
            sb.append(len+"#"+strs.get(i));
            
         }
         return sb.toString();
    }

    public List<String> decode(String str) {
        //System.out.println("Str: "+str+" length: "+str.length());
        List<String> list = new ArrayList();
        int idx=0;
        while(idx<str.length()){
            //System.out.println("Index of "+str.indexOf("#"));
			String lenInStr = str.substring(0,str.indexOf("#"));
			//System.out.println("lenInStr "+lenInStr);
			int lengthInInt = Integer.parseInt(lenInStr);
			String cut = str.substring(
			    str.indexOf("#")+1,str.indexOf("#")+1+lengthInInt);
			//System.out.println("cut "+cut);
			str = str.substring(str.indexOf("#")+1+lengthInInt,str.length());
			//System.out.println("new Str "+str);
			list.add(cut);
           
        }
        return list;
    }
}
  
