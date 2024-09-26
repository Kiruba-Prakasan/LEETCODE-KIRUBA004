class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //List<Integer> res = new ArrayList<>();
        int c=0; 
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                nums1[c]=nums1[i];
                c++;
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,c);
    }
}