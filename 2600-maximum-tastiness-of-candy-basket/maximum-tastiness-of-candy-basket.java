class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int l=0,r=price[price.length-1];
        int max = -1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(isValid(price,m,k)){
                max=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return max;
    }
    private static boolean isValid(int[] price,int m,int k){
        int prev=price[0];
        int c=1;
        for(int i=1;i<price.length;i++){
            if(price[i]-prev>=m){
                c++;
                prev=price[i];
            }
        }
        return c>=k;
    }
}