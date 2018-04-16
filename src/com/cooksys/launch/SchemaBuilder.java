package com.cooksys.launch;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class SchemaBuilder extends SchemaOutputResolver {

	@Override
	public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
		File file = new File("mySuperCoolSchemaDefinition.xsd");
        StreamResult result = new StreamResult(file);
        result.setSystemId(file.toURI().toURL().toString());
        return result;
	}

}
