int trap(int* height, int n) {
    int sum=0;
    int i=0;
    int j=n-1;
    int lmax=height[i];
    int rmax=height[j];
    while(i<j){
        if(lmax<=rmax){
            sum+=(lmax-height[i]);
            i++;
            if(height[i]>lmax){
                lmax=height[i];
            }
        }
        else{
            sum+=(rmax-height[j]);
            j--;
            if(height[j]>rmax){
                rmax=height[j];
            }
        }
    }
    return sum;
}