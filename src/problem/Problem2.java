package problem;

import problem.base.Problem;

import java.util.Arrays;

public class Problem2 implements Problem {
    protected String description = """
            Problem #2 [Hard] ------------------------------------------------------------------------------
            
            Given an array of integers, return a new array such that each element at index i of the new array
            is the product of all the numbers in the original array except the one at i.
            For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
            If our input was [3, 2, 1], the expected output would be [2, 3, 6].
            Follow-up: what if you can't use division?
            """;

    private final int[] array;

    public Problem2(int[] array) {
        this.array = array;
    }

    @Override
    public String solution() {
        if (this.array.length <= 1) {
            return "No solution for given params";
        }

        int[] outputArray = new int[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            Integer iResult = null;
            for (int j = 0; j < this.array.length; j++) {
                if (j != i) {
                 if (iResult == null) {
                     iResult = this.array[j];
                 } else {
                     iResult *= this.array[j];
                 }
                }
            }
            outputArray[i] = iResult;
        }

        return "Input array: " + Arrays.toString(this.array) + "\nOutput array: " + Arrays.toString(outputArray);
    }

    @Override
    public String getDescription() {
        return description;
    }
}
