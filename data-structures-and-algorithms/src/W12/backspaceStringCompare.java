package W12;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String string) {
        StringBuilder buildString = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (c != '#') {
                buildString.append(c);
            } else {
                if (buildString.length() != 0) {
                    buildString.deleteCharAt(buildString.length() - 1);
                }
            }
        } return buildString.toString();
    }
}
