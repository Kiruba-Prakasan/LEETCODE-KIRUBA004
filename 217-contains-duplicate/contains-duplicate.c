int compare(const void *a,const void *b){
    return (*(int*)a-*(int*)b);
}
bool containsDuplicate(int* nums, int n) {
    if(n<=1||nums==NULL){
        return 0;
    }
    qsort(nums,n,sizeof(int),compare);
    for(int i=1;i<n;i++){
        if(nums[i]==nums[i-1]){
            return 1;
        }
    }
    return 0;
}