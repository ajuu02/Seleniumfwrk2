/*    */ package userLibrary;
/*    */ 
/*    */ import com.aventstack.extentreports.ExtentTest;
/*    */ import com.aventstack.extentreports.Status;
/*    */ import driverManagement.LocalDriverManager;
/*    */ import java.io.File;
/*    */ import java.io.PrintStream;
/*    */ import org.apache.commons.io.FileUtils;
/*    */ import org.openqa.selenium.OutputType;
/*    */ import org.openqa.selenium.TakesScreenshot;
/*    */ import org.openqa.selenium.WebDriver;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class objectFunctions
/*    */   extends reportingFunctions
/*    */ {
/* 19 */   WebDriver driver = LocalDriverManager.getDriver();
/*    */   
/*    */ 
/*    */   protected void invokeBrowser(String url, ExtentTest test)
/*    */   {
/* 24 */     System.out.println("Thread id = " + Thread.currentThread().getId());
/* 25 */     System.out.println("Hashcode of webDriver instance = " + LocalDriverManager.getDriver().hashCode());
/* 26 */     LocalDriverManager.getDriver().get(url);
/*    */     
/* 28 */     logStep(test, "Invoke Browser Method", Status.PASS);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected void quitBrowser(ExtentTest test)
/*    */   {
/* 35 */     LocalDriverManager.getDriver().quit();
/*    */     
/* 37 */     logStep(test, "QuitBrowser", Status.PASS);
/*    */   }
/*    */   
/*    */ 
/*    */   protected String getscreenshot(String screenShotName)
/*    */     throws Exception
/*    */   {
/* 44 */     File scrFile = (File)((TakesScreenshot)LocalDriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
/*    */     
/* 46 */     FileUtils.copyFile(scrFile, new File("./screenshots/" + screenShotName));
/*    */     
/* 48 */     return "./screenshots/" + screenShotName;
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     userLibrary.objectFunctions
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */