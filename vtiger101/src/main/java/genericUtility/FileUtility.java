package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/** 
	 * This method is used to fetch data from the property file
	 * @param key
	 * @return 
	 * @throws IOException
	 */
	
	public String fetchDataFromPropertyFile(String key) throws IOException{
		
		FileInputStream fis = new FileInputStream("./src/test/resources/propertyData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		return prop.getProperty(key);

	}


}
