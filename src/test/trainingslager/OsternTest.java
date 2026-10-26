package test.trainingslager;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import trainingslager.Ostern;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OsternTest {

    @ParameterizedTest
    @MethodSource("data")
    void yearTest(int year, int[] date) {
        assertArrayEquals(date, Ostern.getOstern(year));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2010, new int[] {4, 4, 2010}),
                Arguments.of(1954, new int[] {18, 4, 1954})
        );
    }


}
