class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        StringBuilder s = new StringBuilder();
        int c=0;
        while(n1>=0||n2>=0||c==1){
            if(n1>=0){
                c+=a.charAt(n1--)-'0';
            }
            if(n2>=0){
                c+=b.charAt(n2--)-'0';
            }
            s.append(c%2);
            c/=2;
        }
        return s.reverse().toString();
    }
}