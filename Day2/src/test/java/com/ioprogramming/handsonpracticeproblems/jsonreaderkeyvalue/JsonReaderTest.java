package com.ioprogramming.handsonpracticeproblems.jsonreaderkeyvalue;

import com.ioprogramming.handsonpracticeproblems.jsonreaderkeyvalues.JsonReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReaderTest {

    @Test
    void testPrintJsonKeysAndValues() throws Exception {
        String jsonContent = "{ \"name\": \"Allu\", \"email\": \"allu@arjun.com\", \"age\": 25 }";
        String testFilePath = "test.json";

        Files.write(Paths.get(testFilePath), jsonContent.getBytes());

        assertDoesNotThrow(() -> JsonReader.printJsonKeysAndValues(testFilePath));

        new File(testFilePath).delete(); // Clean up after test
    }
}
