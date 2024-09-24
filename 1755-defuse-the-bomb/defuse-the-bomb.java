class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k==0){
            return res;
        }
        if(k>0){
            for(int i=0;i<n;i++){
                int s=0;
                for(int j=1;j<=k;j++){
                    s+=code[(i+j)%n];
                }
                res[i]=s;
            }
        }
        if(k<0){
            for(int i=0;i<n;i++){
                int s=0;
                for(int j=1;j<=-1*k;j++){
                    s+=code[(i-j+n)%n];
                }
                res[i]=s;
            }
        }
        return res;
    }
}