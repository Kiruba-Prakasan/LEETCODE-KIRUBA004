class Solution {
    public int minOperations(String[] logs) {
        int level = 0;
        for(String s : logs){
            if(s.equals("./"))
                continue;
            if(s.equals("../")){
                if(level > 0)
                    level--;
            }
            else
                level++;
        }
        return level;
    }
}