package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

import io.opentelemetry.api.logs.LogRecordBuilder;
import io.opentelemetry.api.logs.Logger;

public class PropertyReader {
	

public static String property(String key) throws IOException
{
	String projectpath =System.getProperty("user.dir");
	
	String myfile = "\\Objectrepo\\Config.Properties";
	
	FileInputStream fis = new FileInputStream(projectpath + myfile);
	
	Properties pr = new Properties();
	
	pr.load(fis);

	
	
	return pr.getProperty(key);
	
	
	
}
	
}


