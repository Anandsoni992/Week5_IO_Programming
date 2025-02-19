package com.ioprogramming.handsonpracticeproblems.mergejsonfiles;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonMerger {

    public static JsonNode mergeJsonFiles(String filePath1, String filePath2) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode json1 = objectMapper.readTree(new File(filePath1));
        JsonNode json2 = objectMapper.readTree(new File(filePath2));

        JsonNode mergedJson = json1.deepCopy();

        return mergedJson;
    }

    public static void main(String[] args) throws IOException {
        String filePath1 = "E:/Capg/Week5_IO_Programming/Day2/src/main/resources/file1.json";
        String filePath2 = "E:/Capg/Week5_IO_Programming/Day2/src/main/resources/file2.json";

        JsonNode mergedJson = mergeJsonFiles(filePath1, filePath2);
        System.out.println("Merged JSON: " + mergedJson.toPrettyString());
    }
}

