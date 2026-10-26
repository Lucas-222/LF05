package test.spielwiese;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import spielwiese.Maexchen;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class MaexchenTest {
    @ParameterizedTest
    @MethodSource("data")
    void resultTest(int firstDice, int secondDice, int result) {
        assertEquals(result, Maexchen.checkWin(firstDice, secondDice));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 2, 1000),
                Arguments.of(2, 1, 1000),
                Arguments.of(1, 1, 100),
                Arguments.of(6, 6, 600),
                Arguments.of(1, 5, 60)
        );
    }

}
