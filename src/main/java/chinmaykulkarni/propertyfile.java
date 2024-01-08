package chinmaykulkarni;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
	
	public String getpropertyData(String key)  throws IOException {
		
		Properties p=new Properties();
		FileInputStream  fis= new FileInputStream(autoconstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
