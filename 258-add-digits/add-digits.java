class Solution {
    public int addDigits(int num) {
        //Brute Force Approach
        /*
        while(num>=10)
        {
            int rem=num%10;
            int q=num/10;
            int res=rem+q;
            num=res;
        }
        return num;
        */
        if(num==0){
            return 0;
        }
        return 1+(num-1)%9;
    }
}