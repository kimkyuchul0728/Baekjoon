class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0 ; i < my_string.length() ; i++) {
            String li = my_string.split("")[i];
            if (!answer.toString().contains(li)) {
                answer.append(li);
            }
        }
        return answer.toString();
    }
}