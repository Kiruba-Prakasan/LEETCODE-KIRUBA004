class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        StringBuilder lnum = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        // Comaparator
        /* Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b)); */
        // Using BubbleSort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (swap(arr[i], arr[j])) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr[0].equals("0")) {
            return "0";
        }
        for (int i = 0; i < arr.length; i++) {
            lnum.append(arr[i]);
        }
        return lnum.toString();
    }

    private static boolean swap(String a, String b) {
        String ab = a + b;
        String ba = b + a;
        for(int i=0;i<ab.length();i++){
            if (ab.charAt(i) > ba.charAt(i)) {
                return false;
            }
            if (ab.charAt(i) < ba.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}