package com.mateacademy.lessons11;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author spasko
 */
public class MainJsonToClazz {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			MateGroup mateGroup = mapper.readValue(new File("src/main/resources/lesson11/mateGroup.json"),
					MateGroup.class);
			System.out.println(mateGroup);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}