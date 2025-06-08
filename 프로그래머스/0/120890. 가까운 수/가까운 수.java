class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int a = 101;
        for (int i = 0 ; i < array.length ; i++) {
            int b = 0;
            if (array[i] >= n) {
                b = array[i] - n ;
            } else {
                b = n - array[i];
            }
            if (b == a) {
                if (answer > array[i]) {
                    answer = array[i];
                }
            } else if (b < a) {
                a = b;
                answer = array[i];
            }
            
        }
        return answer;
    }
}