package W13;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') res.push(')');
            else if (c == '{') res.push('}');
            else if (c == '[') res.push(']');
            else if (res.isEmpty() || res.pop() != c) return false;
        }
        return res.isEmpty();
    }
}