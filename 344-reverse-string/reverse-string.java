class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        
        // Push all characters to the stack
        for (char ch : s) {
            st.push(ch);
        }
        
        // Pop all characters from the stack and put them back in the array
        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }
    }
}