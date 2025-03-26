package check;

import java.util.List;

public class Check {
    private List<List<Integer>> expected, result;
    public Check(List<List<Integer>> expected, List<List<Integer>> result){
        this.expected = expected;
        this.result = result;
    }
    public boolean check() {
        return expected.equals(result);
    }
}
