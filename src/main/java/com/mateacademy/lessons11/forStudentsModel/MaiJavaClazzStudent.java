package com.mateacademy.lessons11.forStudentsModel;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.mateacademy.lessons11.MateGroup;

import java.io.File;
import java.io.IOException;

public class MaiJavaClazzStudent {
    public static void main(String[] args) {

        MateGroup mateGroup = MateGroup.mateGroupExampleCreator();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        try {

            writer.writeValue(new File("src/main/resources/lesson11/mateGroup.json"), mateGroup);
            System.out.println(writer.writeValueAsString(mateGroup));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}