class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;

        for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(i);
            if (command.equals("UP")) {
                ans = ans - n;
            } else if (command.equals("RIGHT")) {
                ans++;
            } else if (command.equals("DOWN")) {
                ans = ans + n;
            } else {
                ans--;
            }
        }
        return ans;
    }
}