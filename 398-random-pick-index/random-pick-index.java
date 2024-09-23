import java.util.Random;

class Solution {

    private int[] data;
    private Random r;

    public Solution(int[] nums) {
        this.data = nums;
        this.r = new Random();
    }

    public int pick(int target) {
        int count = 0;
        int result = -1;
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                count++;
                if (r.nextInt(count) == 0) {
                    result = i;
                }
            }
        }
        
        return result;
    }
}
