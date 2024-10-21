class Solution {
    public int mySqrt(int x) {
        int s=1,e=x,mid=-1;
        while(s<=e){
            mid = s+(e-s)/2;
            if((long)mid*mid>(long)x){
                e = mid-1;
            }
            else if(mid*mid==x){
                return mid;
            }
            else{
                s = mid+1;
            }
        }
        return Math.round(e);
    }
}