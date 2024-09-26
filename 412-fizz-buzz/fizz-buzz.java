class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
           StringBuilder sb = new StringBuilder();
           if(i%3==0&&i%5==0){
                sb.append("FizzBuzz");
           }
           else if(i%3==0){
                sb.append("Fizz");
           }
           else if(i%5==0){
                sb.append("Buzz");
           }
           answer.add((sb.length()==0)?String.valueOf(i):sb.toString());
        }
        return answer;
    }
}