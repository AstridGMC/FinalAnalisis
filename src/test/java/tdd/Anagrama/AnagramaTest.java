package tdd.Anagrama;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jose
 */
public class AnagramaTest {

    private static final boolean EXPECTED_TRUE = true;
    private static final boolean EXPECTED_FALSE = false;

    @Test
    void testIstAnagramaWhit2AnagramaWords() {
        // Arrange
        Anagrama anagrama = new Anagrama();

        // Act
        boolean result = anagrama.comparar("espada", "pesada");

        // Assert
        assertEquals(EXPECTED_TRUE, result);
    }

    @Test
    void testIsAnagramaWithNoAnagramaWords() {
        // Arrange
        Anagrama anagrama = new Anagrama();

        // Act
        boolean result = anagrama.comparar("espada", "pesada");

        // Assert
        assertEquals(EXPECTED_FALSE, result);
    }
}
