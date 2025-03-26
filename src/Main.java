import output.Output;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int example = 0;
        int target;
        int[] nums;
        List<List<Integer>> expected;

        Output output = new Output();

        example++;
        nums = new int[] {1,0,-1,0,-2,2};
        target = 0;
        expected = Arrays.asList(
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1)
        );
        output.setOutputData(example, target, nums, expected);
        output.prinSolution();

        example++;
        nums = new int[] {2, 2, 2, 2, 2};
        target = 8;
        expected = Arrays.asList(Arrays.asList(2, 2, 2, 2));
        output.setOutputData(example, target, nums, expected);
        output.prinSolution();
    }
}