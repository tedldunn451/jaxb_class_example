package com.cooksys.launch;

import java.io.File;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Launcher {
	
	public static void main(String[] args) throws JAXBException {
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class, FastTrackDClass.class);
		
		Student student = new Student("Michael");
		Student studentTwo = new Student("Will");
		
		FastTrackDClass clazz = new FastTrackDClass();
		clazz.setMonth("04");
		clazz.setLocation("Memphis");
		
		clazz.getStudents().addAll(Arrays.asList(student, studentTwo));
		
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(clazz, new File("instructor.xml"));
		
		
		
	}
	
}
