package com.cooksys.launch;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class SchemaGenerationLauncher {

	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Student.class, FastTrackDClass.class);
		
		context.generateSchema(new SchemaBuilder());
		
	}
	
}
