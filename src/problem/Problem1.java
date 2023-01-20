package problem;

import problem.base.Problem;

import java.util.Arrays;

public class Problem1 implements Problem {
    protected String description = """
            Problem #1 [Easy]
           
            Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
            For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
            Bonus: Can you do this in one pass?
            """;
    private int[] array;
    private int k;

    public Problem1(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    @Override
    public String solution() {
        if (this.k == 0 || this.array.length == 0) {
            return "No solution for given params";
        }

        for (int i = 0; i < this.array.length; i++) {
            var a = this.array[i];
            for (int j = 0; j < this.array.length; j++) {
                var b = this.array[j];
                if (i != j && this.isSumEqualToK(a, b)) {
                    return "For given list: "+Arrays.toString(this.array)+"\nSolution: "+a+" + "+b+" = "+this.k;
                }
            }
        }

        return "No solution for given params";
    }

    private boolean isSumEqualToK(int a, int b) {
        return (a + b) == k;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
