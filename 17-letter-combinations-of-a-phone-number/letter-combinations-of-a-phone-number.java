class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = map();
        List<String> ans =  new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        phone(0,digits,"",ans,map);
        return ans;
    }
    private static void phone(int i,String digits,String s,List<String> ans,HashMap<Character,String> map){
        if(i==digits.length()){
            ans.add(s);
            return;
        }
        else{
            for(char ch : map.get(digits.charAt(i)).toCharArray()){
                String temp = new String(s);
                temp+=ch;
                phone(i+1,digits,temp,ans,map);
            }
        }
    }
    private static HashMap<Character,String> map(){
        HashMap<Character,String> hmap = new HashMap<>();
        hmap.put('2',"abc");
        hmap.put('3',"def");
        hmap.put('4',"ghi");
        hmap.put('5',"jkl");
        hmap.put('6',"mno");
        hmap.put('7',"pqrs");
        hmap.put('8',"tuv");
        hmap.put('9',"wxyz");
        return hmap;
    }
}