import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            int y = intList.get(i);
            if (y > 0 && y % 2 == 0) {
                result.add(y);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}