import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] recoverArray(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int ans[] = new int[nums.length / 2];
        for (int i = 1; i < nums.length; i++) {
            int k = (nums[i] - nums[0]) / 2;
            if (k == 0)
                continue;
            HashMap<Integer, Integer> hm2 = new HashMap<>(hm);
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (hm2.get(nums[j]) >= 1) {
                    if (hm2.getOrDefault(nums[j] + 2 * k, 0) >= 1) {
                        ans[index] = nums[j] + k;
                        hm2.put(nums[j], hm2.get(nums[j]) - 1);
                        hm2.put(nums[j] + 2 * k, hm2.get(nums[j] + 2 * k) - 1);
                    } else if (hm2.getOrDefault(nums[j] - 2 * k, 0) >= 1) {
                        ans[index] = nums[j] - k;
                        hm2.put(nums[j], hm2.get(nums[j]) - 1);
                        hm2.put(nums[j] - 2 * k, hm2.get(nums[j] - 2 * k) - 1);
                    } else {
                        break;
                    }
                    index++;
                }
            }
            if (index == nums.length / 2)
                break;
        }
        return ans;
    }
}