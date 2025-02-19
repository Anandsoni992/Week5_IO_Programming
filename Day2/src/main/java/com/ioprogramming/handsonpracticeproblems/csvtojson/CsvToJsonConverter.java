package com.ioprogramming.handsonpracticeproblems.csvtojson;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvToJsonConverter {

    public static String convertCsvToJson(String csvFilePath) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class)
                .with(csvSchema)
                .readValues(new File(csvFilePath));

        List<Map<String, String>> data = iterator.readAll();
        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(data);
    }

    public static void main(String[] args) throws IOException {
        String csvFilePath = "E:/Capg/Week5_IO_Programming/Day2/src/main/resources/data.csv";
        String jsonOutput = convertCsvToJson(csvFilePath);
        System.out.println("JSON Output:\n" + jsonOutput);
    }
}
