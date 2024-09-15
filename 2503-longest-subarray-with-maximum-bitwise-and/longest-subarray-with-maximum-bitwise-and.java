class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int num : nums){
            if(num>max){
                max=num;
            }
        }
        int sub_len=0,len=1;
        for(int num : nums){
            if(num==max){
                sub_len++;
            }
            else{
                len = (sub_len>len)?sub_len:len;
                sub_len=0;
            }
        }
        len = (sub_len>len)?sub_len:len;
        return len;
    }
}