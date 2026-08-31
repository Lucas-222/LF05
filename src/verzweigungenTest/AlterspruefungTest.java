package verzweigungenTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import verzweigungen.Alterspruefung;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class AlterspruefungTest {

    @ParameterizedTest
    @MethodSource("data_GivenAge_AgeValidOrNot")
    void givenAge_AgeValidOrNot(int age, boolean ok) {
        assertEquals(ok, Alterspruefung.isAgeInRange(age));
    }

    @Test
    void testAgeLogik() {
        assertEquals(Alterspruefung.ages.UNDERAGE, Alterspruefung.setAge(10));
        assertEquals(Alterspruefung.ages.OFAGE, Alterspruefung.setAge(28));
    }

    static Stream<Arguments> data_GivenAge_AgeValidOrNot() {
        return Stream.of(
                Arguments.of(-99, false),
                Arguments.of(100000, false),
                Arguments.of(10, true)
        );
    }

}
