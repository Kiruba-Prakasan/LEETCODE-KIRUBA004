class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                res.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[res.size()];
        int m=0;
        for(int num : res){
            arr[m] = num;
            m++;
        }
        return arr;
    }
}