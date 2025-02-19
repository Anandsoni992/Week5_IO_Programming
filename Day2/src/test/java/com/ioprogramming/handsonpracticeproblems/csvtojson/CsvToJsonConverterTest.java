package com.ioprogramming.handsonpracticeproblems.csvtojson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CsvToJsonConverterTest {

    @Test
    void testConvertCsvToJson() throws Exception {
        String expectedJson = "[{\"name\":\"Samay\",\"age\":\"25\",\"email\":\"samay@raina.com\"},"
                + "{\"name\":\"raftaar\",\"age\":\"30\",\"email\":\"raftaar@bhai.com\"},"
                + "{\"name\":\"honeysingh\",\"age\":\"28\",\"email\":\"honey@singh.com\"}]";

        String jsonOutput = CsvToJsonConverter.convertCsvToJson("E:/Capg/Week5_IO_Programming/Day2/src/main/resources/data.csv");

        assertTrue(jsonOutput.contains("\"name\":\"Samay\""));
        assertTrue(jsonOutput.contains("\"age\":\"25\""));
        assertTrue(jsonOutput.contains("\"email\":\"samay@raina.com\""));
    }
}
