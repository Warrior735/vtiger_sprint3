package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImplementionClass implements ITestListener{


	public void onTestFailure(ITestResult result) {
		
	String methodName=result.getMethod().getMethodName();
		
		TakesScreenshot ts= (TakesScreenshot)BaseClass.sDriver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination= new File ("./Screenshots/"+methodName+".png");
		
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
		
	}

	

	
	
	
	

}
