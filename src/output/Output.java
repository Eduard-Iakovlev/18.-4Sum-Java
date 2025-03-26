package output;

import check.Check;
import solution.Solution;
import java.util.List;

public class Output {
    private int example, target;
    private int[] nums;
    private List<List<Integer>> expected, res;

    private void setExample(int example) {
        this.example = example;
    }

    private void setTarget(int target) {
        this.target = target;
    }

    private void setNums(int[] nums) {
        this.nums = nums;
    }

    private void setExpected(List<List<Integer>> expected) {
        this.expected = expected;
    }

    private void setRes() {
        Solution sol = new Solution();
        this.res = sol.fourSum(nums, target);
    }

    private void printcheck() {
        Check check = new Check(expected, res);
        if(check.check()) System.out.println("Проверка пройдена!");
        else System.out.println("Проверка НЕ пройдена!");
    }

    private void printres() {
        if(res == null) System.out.println(" Полученный результат: " + "[[ ]]");
        else System.out.println(" Полученный результат: " + java.util.Arrays.toString(res.toArray()));
    }

    public void setOutputData(int example, int target, int[] nums, List<List<Integer>> expected) {
        setExample(example);
        setTarget(target);
        setNums(nums);
        setExpected(expected);
    }

    public void prinSolution() {
        System.out.println("============ Тест №" + example + " =======================");
        System.out.println(" Исходный массив: " + java.util.Arrays.toString(nums) + ", цель: " + target);
        System.out.println(" Ожидаемый результат: " + java.util.Arrays.toString(expected.toArray()));
        setRes();
        printres();
        System.out.println("============ Проверка результата ============");
        printcheck();
        System.out.println("=============================================\n");
    }
}
