package problem;

import problem.base.Problem;

public class Problem5 implements Problem {
    protected String description = """
            Problem #5 [Medium]
                        
            cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
            For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
                        
            Given this implementation of cons:
                        
            def cons(a, b):
                def pair(f):
                    return f(a, b)
                return pair
            Implement car and cdr.
            """;

    @Override
    public String solution() {
        return null;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
