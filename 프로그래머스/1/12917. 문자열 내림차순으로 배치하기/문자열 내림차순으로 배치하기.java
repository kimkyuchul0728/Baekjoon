import java.util.*;

class Solution {
    public String solution(String s) {
        
        List<Character> list = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());
        String answer = "";
        for (int i = 0 ; i < s.length() ; i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}