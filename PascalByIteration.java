import java.util.ArrayList;
import java.util.List;

public class PascalByIteration {
    public static void main(String[] args) {
        int maxHeight = 7;

        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < maxHeight; i++) 
        {
            List<Integer> col = new ArrayList<>();
            for (int j = 0; j <= i; j++) 
            {
                if (j == 0 || j == i) 
                    col.add(1);

                else 
                    col.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
            }
            answer.add(col);
        }

        for (List<Integer> row : answer) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}