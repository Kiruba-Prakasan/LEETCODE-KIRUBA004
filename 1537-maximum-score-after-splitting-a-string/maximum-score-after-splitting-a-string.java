class Solution {
    public int maxScore(String s) {
        //BruteForce
        /*
        int max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            String sub1 = s.substring(0,i);
            String sub2 = s.substring(i);
            int zc = (int)sub1.chars().filter(ch -> ch == '0').count();
            int oc = (int)sub2.chars().filter(ch -> ch == '1').count();
            max = Math.max(max,zc+oc);
        }
        */
        int max=Integer.MIN_VALUE;
        int toc = 0;
        for(char c : s.toCharArray()){
            if(c=='1'){
                toc++;
            }
        }
        int zc = 0;
        int oc = toc;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zc++;
            }
            else{
                oc--;
            }
            max=Math.max(max,zc+oc);
        }
        return max;
    }
}