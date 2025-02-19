package com.ioprogramming.practiceproblems.listtojson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ListToJsonConverterTest {

    @Test
    void testConvertListToJson() throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Samay", 40),
                new Person("Raftaar", 35)
        );

        String result = ListToJsonConverter.convertListToJson(people);

        assertTrue(result.contains("\"name\":\"Samay\""));
        assertTrue(result.contains("\"age\":40"));
        assertTrue(result.contains("\"name\":\"Raftaar\""));
        assertTrue(result.contains("\"age\":35"));
    }
}
