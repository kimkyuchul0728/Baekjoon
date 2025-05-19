import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] basket = new int[N];
        for (int i = 0 ; i < N ; i++) {
            basket[i] = i + 1;
        }
        int M = scanner.nextInt();
        for (int i = 0 ; i < M ; i++) {
            int left = scanner.nextInt() - 1;
            int right = scanner.nextInt() - 1;
            while (left < right) {
                int memory = basket[left];
                basket[left] = basket[right];
                basket[right] = memory;
                left++;
                right--;
            }
        }
        for (int i = 0 ; i < N - 1 ; i++) {
            System.out.print(basket[i] + " ");
        }
        System.out.println(basket[N - 1]);
    }
}
