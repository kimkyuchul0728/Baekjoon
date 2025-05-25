class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int fac = 1;
        for (int i = 1 ; i <= n ; i++) {
            fac *= i;
            answer = i;
            if (fac > n) {
                return answer - 1;
            }
        }
        return answer;
    }
}