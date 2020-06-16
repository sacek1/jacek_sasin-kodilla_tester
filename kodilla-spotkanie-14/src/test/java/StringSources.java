import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringSources {

    static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of(1, false),
                Arguments.of(0, true)
        );
    }

}
