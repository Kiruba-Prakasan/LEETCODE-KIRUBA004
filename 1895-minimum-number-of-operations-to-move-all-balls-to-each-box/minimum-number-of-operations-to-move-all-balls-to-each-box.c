int* minOperations(char* boxes, int* returnSize) {
    int n = strlen(boxes);
    *returnSize = n;
    int* res = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        res[i]=0;
        for(int j=0;j<n;j++){
            if(boxes[j]=='1'){
                res[i]+=abs(i-j);
            }
        }
    }
    return res;
}