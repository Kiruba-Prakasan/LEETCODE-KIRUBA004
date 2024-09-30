class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            int c=nums[i]-1;
            if(nums[i]!=nums[c])
            {
                swap(nums,i,c);
            }
            else
            {
                i++;
            }
        }

        for(int j=1;j<=nums.length;j++)
        {
            if(nums[j-1]!=j)
            {
                res.add(j);
            }
        }

        return res;
    }


    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
}