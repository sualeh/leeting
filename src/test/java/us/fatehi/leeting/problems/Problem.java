package us.fatehi.leeting.problems;

import org.junit.jupiter.api.Test;

public interface Problem {

    @Test
    public void testImplementation();

    Object solutionObject();

    default void DEBUG(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }

}
