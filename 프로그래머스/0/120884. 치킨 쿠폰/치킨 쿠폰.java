class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            int coupon = 0;
            answer += chicken / 10;
            coupon = chicken / 10;
            chicken = chicken % 10;
            chicken += coupon;
        }
        return answer;
    }
}