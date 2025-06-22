class Solution {
    public String solution(int a, int b) {
        String[] answer = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] num = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0 ; i < a - 1 ; i++) {
            b += num[i];
        }
        int result = b % 7;
        
        return answer[result];
    }
}