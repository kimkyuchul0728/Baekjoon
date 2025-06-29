import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들의 찍는 패턴
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자의 점수
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) scores[0]++;
            if (answers[i] == p2[i % p2.length]) scores[1]++;
            if (answers[i] == p3[i % p3.length]) scores[2]++;
        }

        // 최고 점수 구하기
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수를 받은 사람 저장 (1번, 2번, 3번 수포자)
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                result.add(i + 1); // 인덱스는 0부터 시작하므로 +1
            }
        }

        // List를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
