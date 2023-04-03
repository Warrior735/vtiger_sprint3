package genericUtility;
import java.util.Date;

public class JavaUtility {

	public String GenerateSystemDateAndTime() {
		Date date= new Date();
		return date.toString().replace(" ","_").replace(":","_");
	}
}
