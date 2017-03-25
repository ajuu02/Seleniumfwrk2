/*    */ package driverManagement;
/*    */ 
/*    */ import com.aventstack.extentreports.ExtentReporter;
/*    */ import com.aventstack.extentreports.ExtentReports;
/*    */ import com.aventstack.extentreports.ExtentTest;
/*    */ import com.aventstack.extentreports.Status;
/*    */ import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Properties;
/*    */ import org.openqa.selenium.WebDriver;
/*    */ import org.testng.IInvokedMethod;
/*    */ import org.testng.IInvokedMethodListener;
/*    */ import org.testng.ISuite;
/*    */ import org.testng.ISuiteListener;
/*    */ import org.testng.ITestNGMethod;
/*    */ import org.testng.ITestResult;
/*    */ 
/*    */ 
/*    */ public class WebDriverListener
/*    */   implements IInvokedMethodListener, ISuiteListener
/*    */ {
/* 24 */   ExtentReports extent = new ExtentReports();
/*    */   
/*    */ 
/*    */   public void beforeInvocation(IInvokedMethod method, ITestResult testResult)
/*    */   {
/* 29 */     if (method.isTestMethod())
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */       Properties prop = new Properties();
/* 36 */       InputStream in = null;
/*    */       try
/*    */       {
/* 39 */         in = new FileInputStream("./Config/config.properties");
/* 40 */         prop.load(in);
/*    */       }
/*    */       catch (IOException e) {
/* 43 */         e.printStackTrace();
/*    */       }
/* 45 */       WebDriver driver = LocalDriverFactory.createInstance(prop.getProperty("browser"), prop.getProperty("browser_driver_location"));
/* 46 */       LocalDriverManager.setWebDriver(driver);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void afterInvocation(IInvokedMethod method, ITestResult testResult)
/*    */   {
/* 53 */     if (method.isTestMethod()) {
/* 54 */       WebDriver driver = LocalDriverManager.getDriver();
/* 55 */       if (driver != null) {
/* 56 */         driver.quit();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void onStart(ISuite suite)
/*    */   {
/* 64 */     ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
/*    */     
/* 66 */     extent.attachReporter(new ExtentReporter[] { htmlReporter });
/* 67 */     extent.flush();
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void onFinish(ISuite suite) {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void createTest(IInvokedMethod method)
/*    */   {
/* 80 */     ExtentTest test = extent.createTest(method.getTestMethod().getMethodName(), "Test Method");
/* 81 */     test.log(Status.INFO, method.getTestMethod().getMethodName());
/* 82 */     extent.flush();
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     driverManagement.WebDriverListener
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */