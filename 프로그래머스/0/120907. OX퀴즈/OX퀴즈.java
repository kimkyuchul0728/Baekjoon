import java.util.*;

public class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            // 선형 검색처럼 하나하나 수식 확인
            String[] parts = quiz[i].split(" ");

            int left = Integer.parseInt(parts[0]);
            String op = parts[1];
            int right = Integer.parseInt(parts[2]);
            int answer = Integer.parseInt(parts[4]);

            int calc = (op.equals("+")) ? left + right : left - right;

            result[i] = (calc == answer) ? "O" : "X";
        }

        return result;
    }
}