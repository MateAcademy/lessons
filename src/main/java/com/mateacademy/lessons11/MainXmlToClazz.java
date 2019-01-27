package com.mateacademy.lessons11;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author spasko
 */
public class MainXmlToClazz {
	public static void main(String[] args) {

		try {
			File file = new File("src/main/resources/lesson11/mateGroup.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(MateGroup.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			MateGroup mateGroup = (MateGroup) jaxbUnmarshaller.unmarshal(file);
			System.out.println(mateGroup);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}