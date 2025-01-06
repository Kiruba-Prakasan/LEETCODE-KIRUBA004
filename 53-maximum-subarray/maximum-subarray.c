int maxSubArray(int* nums, int n) {
    int i = 0,j = n;
    int sum = 0;
    int max = INT_MIN;
    while(i<j){
        if(sum<0 && nums[i]>sum){
            sum=0;
        }
        sum+=nums[i];
        if(max<sum){
            max = sum;
        }
        i++;
    }
    return max;
}