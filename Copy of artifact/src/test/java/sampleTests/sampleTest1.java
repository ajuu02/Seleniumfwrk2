package sampleTests;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Reports.ExtentTestNGITestListener;
import userLibrary.userLibrary;
 

@Listeners({driverManagement.WebDriverListener.class,ExtentTestNGITestListener.class})

public class sampleTest1 extends userLibrary{
	
   @Test
    public void testMethod11(Method method) throws Exception {
	   ExtentTest test=ExtentTestNGITestListener.extent.createTest(method.getName());
       invokeBrowser("http://www.ndtv.com",test);
       logStep(test,  "TEST11", Status.FAIL); 
       logStep(test,  "TEST11", Status.FAIL); 
       logStep(test,  "TEST11", Status.FAIL); 
       logStep(test,  "TEST11", Status.FAIL); 
       logStep(test,  "TEST11", Status.FAIL); 
       logStepWithScreenShot(test,  "Step With ScreenShot", Status.PASS,getscreenshot("TEST11_SS1"));
       logStepWithScreenShot(test,  "Step With ScreenShot", Status.PASS,getscreenshot("TEST11_SS2"));
       quitBrowser(test);
       successMessageFunction(test);
    }
 
    @Test
    public void testMethod12(Method method) {
    	 ExtentTest test=ExtentTestNGITestListener.extent.createTest(method.getName());
         invokeBrowser("http://www.ndtv.com",test);
         logStep(test,  "TEST12", Status.PASS); 
         logStep(test,  "TEST12", Status.PASS); 
         logStep(test,  "TEST12", Status.PASS); 
         logStep(test,  "TEST12", Status.PASS); 
         logStep(test,  "TEST12", Status.PASS); 
         quitBrowser(test);
    }
 
    
}
