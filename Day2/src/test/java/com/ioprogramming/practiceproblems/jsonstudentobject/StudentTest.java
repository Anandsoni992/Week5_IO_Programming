package com.ioprogramming.practiceproblems.jsonstudentobject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StudentTest {

    @Test
    void testStudentJsonConversion() throws Exception {
        Student student = new Student("Samay Raina", 22, List.of("Physics", "Chemistry"));
        String json = student.toJson();

        assertTrue(json.contains("\"name\":\"Alice\""));
        assertTrue(json.contains("\"age\":22"));
        assertTrue(json.contains("\"subjects\":[\"Physics\",\"Chemistry\"]"));
    }
}
