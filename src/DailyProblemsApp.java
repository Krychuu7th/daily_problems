import problem.Problem1;
import problem.Problem2;
import problem.problem3.Problem3;

public class DailyProblemsApp {
    public static void main(String[] args) {
        /*Problem #1*/
        int[] problem1Array = {2, 16, 1, 7};
        int problem1K = 9;
        new Problem1(problem1Array, problem1K).show();

        /*Problem #2*/
        int[] problem2InputArray = {1, 2, 3, 4, 5};
        new Problem2(problem2InputArray).show();

        /*Problem #3*/
        new Problem3().show();
    }
}
