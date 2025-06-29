class Solution {
    public int solution(String dartResult) {
        int[] answer = new int[3];
        int k = 0;
        String num = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch;  // 숫자는 누적 (10 대비)
            } else if (ch == 'S') {
                answer[k++] = (int) Math.pow(Integer.parseInt(num), 1);
                num = "";
            } else if (ch == 'D') {
                answer[k++] = (int) Math.pow(Integer.parseInt(num), 2);
                num = "";
            } else if (ch == 'T') {
                answer[k++] = (int) Math.pow(Integer.parseInt(num), 3);
                num = "";
            } else if (ch == '*') {
                if (k > 0) answer[k - 1] *= 2;
                if (k > 1) answer[k - 2] *= 2;
            } else if (ch == '#') {
                if (k > 0) answer[k - 1] *= -1;
            }
        }

        return answer[0] + answer[1] + answer[2];
    }
}
        
           
           
     
           
//입력 형식
            
// “점수|보너스|[옵션]”으로 이루어진 문자열 3세트.
// 예) 1S2D*3T

// 점수는 0에서 10 사이의 정수이다.
// 보너스는 S, D, T 중 하나이다.
// 옵선은 *이나 # 중 하나이며, 없을 수도 있다.
    
// 출력 형식
// 3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
// 예) 37

           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
         
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           

 