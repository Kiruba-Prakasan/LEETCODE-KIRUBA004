class Solution {
    public int waysToSplitArray(int[] nums) {
        /*
        TIME LIMIT EXCEEDED ERROR (TLE)
        int count=0;
        int n=nums.length;
        int[] pre1=new int[n];
        int[] pre2=new int[n];
        pre1[0]=nums[0];
        //[10,4,-8,7]
        //[10,14,6,13]
        for(int i=1;i<n;i++){
            pre1[i]=pre1[i-1]+nums[i];
        }
        //[10,4,-8,7]
        //[10,3,-1,7]
        for(int i=0;i<n;i++){
            pre2[i]=0;
            for(int j=i;j<n;j++){
                pre2[i]+=nums[j];
            }
        }
        //[10,14,6,13]
        //[10,3,-1,7]
        for(int i=1;i<n;i++){
            if(pre1[i-1]>=pre2[i]){
                count++;
            }
        }
        return count;
        */
        int count=0;
        long psum=0;
        long ssum=0;
        long tot=0;
        int n=nums.length;
        for(int num : nums){
            tot+=num;
        }
        for(int i=0;i<n-1;i++){
            psum+=nums[i];
            ssum=tot-psum;
            if(psum>=ssum){
                count++;
            }
        }
        return count;
    }
}