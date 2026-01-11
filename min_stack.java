/**************
  Design a stack class that supports the push, pop, top, and getMin operations.

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
Each function should run in 
O
(
1
)
O(1) time.
***********************/
class MinStack {
    int[] stack = null;
    int index=-1;
    int min = Integer.MAX_VALUE;
    Stack<Integer> trackstack = new Stack();
    public MinStack() {
        stack = new int[2048];
    }
    
    public void push(int val) {
        stack[++index] = val;
        min = Math.min(min,val);
        if(trackstack.size()==0){
            trackstack.push(val);
        }else if(val <= trackstack.peek()){
            trackstack.push(val);
        }
    }
    
    public void pop() {
        if(trackstack.size()>0 && trackstack.peek() == stack[index] ){
            trackstack.pop();
        }
        index--;
        
    }
    
    public int top() {
        return stack[index];
    }
    
    public int getMin() {
        return trackstack.peek();
    }
}
