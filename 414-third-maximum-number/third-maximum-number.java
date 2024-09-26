class Solution {
    public int thirdMax(int[] nums) {
        long fm = Long.MIN_VALUE;
        long sm = Long.MIN_VALUE;
        long tm = Long.MIN_VALUE;
        for(int num : nums){
            if(num==sm||num==fm||num==tm){
                continue;
            }
            if(fm<num){
                tm = sm;
                sm = fm;
                fm = num;
            }
            else if(sm<num){
                tm = sm;
                sm = num;
            }
            else if(tm<num){
                tm = num;
            }
        }
        return (tm == Long.MIN_VALUE)?(int)fm:(int)tm;
    }
}