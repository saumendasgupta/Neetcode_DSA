/*************
  You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.
  **************/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==')' && stack.size()!=0){
                 if(stack.pop()!='('){
                    return false; 
                 }
            }
            else if(c=='}' && stack.size()!=0){
                 if(stack.pop()!='{'){
                    return false; 
                 }
            }
            else if(c==']' && stack.size()!=0){
                 if(stack.pop()!='['){
                    return false; 
                 }
            }else {
                stack.push(c);
            }

        }
        return stack.size()==0;
    }
}
