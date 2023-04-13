class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack();
        while(i<n) {
            if(stack.isEmpty() || stack.peek()!=popped[j]) {
                stack.push(pushed[i]);
                i++;
            }
            while(!stack.isEmpty() && stack.peek()==popped[j]) {
                stack.pop();
                j++;
            } 
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}

//Tc -> O(N) + O(N) 
//Sc -> O(N) 
