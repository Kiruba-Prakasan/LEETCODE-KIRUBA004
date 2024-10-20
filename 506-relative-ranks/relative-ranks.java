class Solution {
    public String[] findRelativeRanks(int[] s) {
        int n=s.length;
        int[][] sp = new int[n][2];
        for(int i=0;i<n;i++){
            sp[i][0]=i;
            sp[i][1]=s[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(sp[j][1]<sp[j+1][1]){
                    int[] temp = sp[j];
                    sp[j]= sp[j+1];
                    sp[j+1] = temp;
                }
            }
        }
        String[] ranks = new String[n];
        for(int i=0;i<n;i++){
            if(i==0){
                ranks[sp[i][0]]="Gold Medal";
            }
            else if(i==1){
                ranks[sp[i][0]]="Silver Medal";
            }
            else if(i==2){
                ranks[sp[i][0]]="Bronze Medal";
            }
            else{
                ranks[sp[i][0]]=String.valueOf(i+1);
            }
        }
        return ranks;
    }
}
