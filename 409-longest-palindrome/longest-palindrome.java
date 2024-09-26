class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[256];
        int c=0;
        int len = 0;
        for(char ch : s.toCharArray()){
            arr[ch]++;
        }
        for(int f : arr){
            if(f%2==0){
                len+=f;
            }
            else{
                len+=f-1;
                c=1;
            }
        }
        return (c==0)?len:len+1;
    }
}