package com.ioprogramming.handsonpracticeproblems.jsontoxml;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JsonToXmlConverterTest {

    @Test
    void testConvertJsonToXml() throws Exception {
        String jsonInput = "{ \"name\": \"Samay\", \"age\": 25, \"email\": \"samay@raina.com\" }";
        String xmlOutput = JsonToXmlConverter.convertJsonToXml(jsonInput);

        assertTrue(xmlOutput.contains("<name>Samay</name>"));
        assertTrue(xmlOutput.contains("<age>25</age>"));
        assertTrue(xmlOutput.contains("<email>samay@raina.com</email>"));
    }
}
