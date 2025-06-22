import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++) {
            if (stack.size() == 0) {
                stack.push(arr[i]);
                continue;
            }
            if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        
        int[] array = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            array[i] = stack.get(i); 
        }
        
        return array;
    }
}