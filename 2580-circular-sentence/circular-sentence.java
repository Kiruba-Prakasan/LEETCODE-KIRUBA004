class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        int n = arr.length;

        if (arr[n - 1].charAt(arr[n - 1].length() - 1) != arr[0].charAt(0)) {
            return false;
        }

        for (int i = 1; i < n; i++) {
            String s1 = arr[i - 1];
            String s2 = arr[i];
            if (s1.charAt(s1.length() - 1) != s2.charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
