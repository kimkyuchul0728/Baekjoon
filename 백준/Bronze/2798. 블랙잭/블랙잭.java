import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = 0;

        for (int i = 0 ; i < n-2 ; i++) {
            for (int j = i + 1 ; j < n-1 ; j++) {
                for (int k = j + 1 ; k < n ; k++) {
                    if (arr[i] + arr[j] + arr[k] <= m) {
                        if (arr[i] + arr[j] + arr[k] > result) {
                            result = arr[i] + arr[j] + arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
