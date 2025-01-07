int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int** threeSum(int* nums, int n, int* returnSize, int** returnColumnSizes) {
    int capacity = 10000;
    int **res = (int **)malloc(sizeof(int *) * capacity);
    *returnColumnSizes = (int *)malloc(sizeof(int) * capacity);
    *returnSize = 0;
    
    qsort(nums, n, sizeof(int), compare);
    
    for(int i = 0; i < n - 2; i++) {
        if(i > 0 && nums[i] == nums[i-1]) continue;
        
        int j = i + 1;
        int k = n - 1;
        
        while(j < k) {
            long sum = (long)nums[i] + nums[j] + nums[k];
            
            if(sum < 0) {
                j++;
            } else if(sum > 0) {
                k--;
            } else {
                if(*returnSize >= capacity) {
                    capacity *= 2;
                    res = (int **)realloc(res, sizeof(int *) * capacity);
                    *returnColumnSizes = (int *)realloc(*returnColumnSizes, sizeof(int) * capacity);
                    if(!res || !(*returnColumnSizes)) return NULL;
                }
                
                res[*returnSize] = (int*)malloc(3 * sizeof(int));
                res[*returnSize][0] = nums[i];
                res[*returnSize][1] = nums[j];
                res[*returnSize][2] = nums[k];
                (*returnColumnSizes)[*returnSize] = 3;
                (*returnSize)++;
                
                j++;
                while(j < k && nums[j] == nums[j-1]) j++;
            }
        }
    }
    
    return res;
}