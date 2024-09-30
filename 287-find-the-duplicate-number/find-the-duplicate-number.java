class Solution {
    public int findDuplicate(int[] nums) {
        /*
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int c=nums[i]-1;
                if(nums[i]!=nums[c])
                {
                    swap(nums,i,c);
                }
                else
                {
                    return nums[i];
                }
            }
            else
            {
                i++;
            }
        }

        return -1;
        */
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return num;
            }
            map.put(num,1);
        }
        return -1;
    }

    /*
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    */
}