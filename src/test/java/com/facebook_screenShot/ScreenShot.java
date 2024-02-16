package com.facebook_screenShot;

import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.facebook_base.BaseTest;

public class ScreenShot {
	
	public void screenShot() {
		//String fN="faruq";
		
		BaseTest baseTest= new BaseTest();
		//has a reltionship
		//baseTest =class referncial variable name
		//BaseTest= class--> class data type
		//new BaseTest()=constructor---> assignment or the value
		
		WebDriver driver=baseTest.openApplication();
		
		TakesScreenshot	takesScreenShot=((TakesScreenshot)driver);
		//TakesScreenshot is a interface class== as a result you can not create constructor out of it
		         //has a reltionship
				//takesScreenShot =class referncial variable name
				//TakesScreenshot= class--> class data type
				//(TakesScreenshot)=interface abstract method calling---> assignment or the value
		       // driver= nested driver
		
		//getScreenshotAs = is the function to take the screen shot and it is only File data type
		File srcPic=takesScreenShot.getScreenshotAs(OutputType.FILE);
		// this is the destination path where we want to copy and paste the picture
		// this is String data type
		String destiPic="screenShot/screenShot.png";
		// we are converting String data type to File data type
		File destinationFile= new File(destiPic);
		
		try {
			FileUtils.copyFile(srcPic, destinationFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	 
		
		
		
	}
	
	public void rollUpScreenShot() {

		BaseTest baseTest = new BaseTest();

		WebDriver driver = baseTest.openApplication();

		TakesScreenshot takesScreenShot = ((TakesScreenshot) driver);

		File srcPic = takesScreenShot.getScreenshotAs(OutputType.FILE);
		
		// Date function is giving us mili second time stamp
		// as a results it is always new screen shot. 
	     //Date d = new Date();
	    //long localTime=d.getTime();
		 long localTime =System.currentTimeMillis();
		String destiPic = "screenShot/"+localTime+"_screenShot.png";
		

		File destinationFile = new File(destiPic);

		try {
			FileUtils.copyFile(srcPic, destinationFile);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	public void dynamicRollUpScreenShot(String screenShotName) {


		BaseTest baseTest = new BaseTest();

		WebDriver driver = baseTest.openApplication();

		TakesScreenshot takesScreenShot = ((TakesScreenshot) driver);

		File srcPic = takesScreenShot.getScreenshotAs(OutputType.FILE);
		
		// Date function is giving us mili second time stamp
		// as a results it is always new screen shot. 
	     //Date d = new Date();
	    //long localTime=d.getTime();
		 long localTime =System.currentTimeMillis();
		String destiPic = "screenShot/"+localTime+screenShotName+".png";
		

		File destinationFile = new File(destiPic);

		try {
			FileUtils.copyFile(srcPic, destinationFile);
		} catch (IOException e) {

			e.printStackTrace();
		}

	
	}
	

}
