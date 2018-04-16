package com.cooksys.launch;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadingRainbow {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Student.class, FastTrackDClass.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		FastTrackDClass clazz = (FastTrackDClass) unmarshaller.unmarshal(new File("instructor.xml"));
		
		System.out.println(clazz);
		
	}
	
}
