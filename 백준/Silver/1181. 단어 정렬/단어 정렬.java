import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        ArrayList<String> list1 = list.stream()
                .distinct()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .collect(Collectors.toCollection(ArrayList::new));
        for (String li: list1) {
            System.out.println(li);
        }
    }
}
