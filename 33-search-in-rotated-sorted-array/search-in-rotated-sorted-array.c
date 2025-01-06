int search(int* nums, int n, int target) {
    int st = 0;
    int en = n-1;
    while(st<=en){
        int mid = st+(en-st)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[st]<=nums[mid]){
            if(nums[st]<=target && nums[mid]>target){
                en = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        else{
            if(nums[mid]<target && nums[en]>=target){
                st = mid+1;
            }
            else{
                en = mid-1;
            }
        }
    }
    return -1;
}