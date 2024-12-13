class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int n : arr) {
            if (s.contains(2 * n) || (n % 2 == 0 && s.contains(n / 2))) {
                return true;
            }
            s.add(n);
        }
        return false;
    }
}
