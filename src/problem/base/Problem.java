package problem.base;

public interface Problem {
    String getDescription();
    String solution();
    default String bonusSolution() {
        return "No bonus solution";
    }

    default void show() {
        System.out.println(this.getDescription() + "\n" + this.solution() + "\n" + this.bonusSolution() + "\n");
    }
}
