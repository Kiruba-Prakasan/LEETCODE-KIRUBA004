void swap(int *a,int *b)
{
    int t;
    t=*a;
    *a=*b;
    *b=t;
}
void sortColors(int* nums, int n) {
    int mid=0,low=0,high=n-1;
    while(mid<=high)
    {
        if(nums[mid]==0)
        {
            swap(&nums[mid],&nums[low]);
            mid++;
            low++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            swap(&nums[mid],&nums[high]);
            high--;
        }
    }
}