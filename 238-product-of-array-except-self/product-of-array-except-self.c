int* productExceptSelf(int* nums, int n, int* returnSize) {
    /*
    *returnSize = n;
    int * res = (int*)malloc(n*sizeof(int));
    int prod = 1;
    int zc=0;
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            prod*=nums[i];
        }
        else{
            zc++;
        }
    }
    for(int i=0;i<n;i++){
        if(zc>1){
            res[i]=0;
        }
        else if(zc==1){
            res[i]=(nums[i]==0)?prod:0;
        }
        else{
            res[i]=prod/nums[i];
        }
    }
    return res;
    */
    int l[n];
    int r[n];
    *returnSize=n;
    int* res = (int*)malloc(n*sizeof(int));
    l[0]=1;
    for(int i=1;i<n;i++){
        l[i]=l[i-1]*nums[i-1];
    }
    r[n-1]=1;
    for(int i=n-2;i>=0;i--){
        r[i]=r[i+1]*nums[i+1];
    }
    for(int i=0;i<n;i++){
        res[i] = l[i]*r[i];
    }
    return res;
}