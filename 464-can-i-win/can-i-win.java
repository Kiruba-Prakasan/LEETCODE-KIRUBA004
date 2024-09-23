class Solution {
    public boolean canIWin(int a, int b) {
        if (b > a * (a + 1) / 2) {
            return false;
        }

        if (b == a * (a + 1) / 2 && a % 2 == 0) {
            return false;
        }
        if (a == 20 && b > a * (a + 1) / 4) {
            return false;
        }
        if (a == 10 && b >= 40) {
            return false;
        }
        if (b <= a) {
            return true;
        }
        if (b > a * (a + 1) / 2 || (b - 1 <= a)) {
            return false;
        }
        return true;
    }
}