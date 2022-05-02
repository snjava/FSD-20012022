import java.io.FileInputStream;
import java.util.Properties;

/*
 * Externalize the properties
 */
public class PropLoader {

	static final Properties prop = new Properties();
	
	static {
		try {
			prop.load(new FileInputStream("/WEB-INF/resoruces/dbconnection.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key) {
		return prop.getProperty(key);
	}
	
}
