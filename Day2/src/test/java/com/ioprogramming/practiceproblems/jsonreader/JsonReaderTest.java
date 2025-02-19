package com.ioprogramming.practiceproblems.jsonreader;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class JsonReaderTest {

    @Test
    void testExtractNameAndEmail() throws Exception {
        File file = new File("E:/Capg/Week5_IO_Programming/Day2/src/main/resources/data.json");
        String result = JsonReader.extractNameAndEmail(file);

        assertTrue(result.contains("Name: Ashish Chanchalani"));
        assertTrue(result.contains("Email: ashish@chanchu.com"));
    }
}
