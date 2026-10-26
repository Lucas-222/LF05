package test.trainingslager;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import trainingslager.Dreiecksungleichung;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class DreiecksungleichungTest {
    @ParameterizedTest
    @MethodSource("dataUngleichungCheck")
    void ungleichungTest(double a, double b, double c, boolean ok) {
        assertEquals(ok, Dreiecksungleichung.check(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("dataCircumferenceCheck")
    void circumferenceTest(double a, double b, double c, double circumference) {
        assertEquals(circumference, Dreiecksungleichung.calculateCircumference(a, b, c));
    }

    @ParameterizedTest
    @MethodSource("dataAreaCheck")
    void areaTest(double a, double b, double c, double area) {
        assertEquals(area, Dreiecksungleichung.calculateArea(a, b, c));
    }


    static Stream<Arguments> dataUngleichungCheck() {
        return Stream.of(
                Arguments.of(3, 4, 5, true),
                Arguments.of(100, 4, 5, false),
                Arguments.of(3, 100, 5, false),
                Arguments.of(3, 4, 100, false)
        );
    }

    static Stream<Arguments> dataCircumferenceCheck() {
        return Stream.of(
                Arguments.of(3, 4, 5, 12)
        );
    }

    static Stream<Arguments> dataAreaCheck() {
        return Stream.of(
                Arguments.of(3, 4, 5, 6)
        );
    }
}
