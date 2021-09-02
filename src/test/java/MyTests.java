import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.File;
import java.io.FileInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTests {

    // Works the same as assertEquals for strings, except multiple correct answers can be provided
    // The aim is to have a helpful error message be printed out when the assertion fails
    public static void assertMultipleEquals(String[] expected, String actual, String message) {
        for (String str: expected) {
            if (str.equals(actual)) {
                assertEquals(str, actual, message);
                return;
            }
        }

        // Currently, it will print out the first expected answer as the "correct" answer
        // However, the message should illuminate what the correct possibilites are
        assertEquals(expected[0], actual, message);
    }

    // Works the same as assertTrue, however, actually calls assertEquals when the condition is false,
    // so that that the error message is more helpful
    public static void assertTrueString(boolean condition, String expected, String actual, String message) {
        if (condition) {
            assertTrue(condition, message);
        }
        else {
            assertEquals(expected, actual, message);
        }
    }

    @Test
    public void testAsksForName() throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(bos));

            FileInputStream is = new FileInputStream(new File("src/test/java/Names.txt"));
            System.setIn(is);

            // Call main()
            MyMain.main(null);
            String output = bos.toString().trim();

            // Test 1: Output is not empty
            assertTrue(output.length() > 0, "The output is empty! You need to print some stuff!");

            // Test 2: Output is at least 50 characters
            assertTrue(output.length() > 50, "The output is too short. Add some more questions for your ChatBot.");

            System.setOut(originalOut);
        }
    }
}
