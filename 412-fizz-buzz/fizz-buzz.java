class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 3 == 0) result += "Fizz";
            if (i % 5 == 0) result += "Buzz";
            answer.add(result.isEmpty() ? String.valueOf(i) : result);
        }
        return answer;
    }
}
