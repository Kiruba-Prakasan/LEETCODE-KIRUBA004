class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=1;i<s.length();i++){
            String sub1 = s.substring(0,i);
            String sub2 = s.substring(i);
            int zc = (int)sub1.chars().filter(ch -> ch == '0').count();
            int oc = (int)sub2.chars().filter(ch -> ch == '1').count();
            max = Math.max(max,zc+oc);
        }
        return max;
    }
}