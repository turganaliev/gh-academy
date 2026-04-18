class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    private String process(String s) {
        StringBuilder cleanStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != '#') cleanStr.append(c);
            else {
                if (cleanStr.length() > 0) {
                    cleanStr.deleteCharAt(cleanStr.length() - 1);
                }
            }
        }
        return cleanStr.toString();
    }
}