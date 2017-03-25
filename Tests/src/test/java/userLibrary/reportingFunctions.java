/*    */ package userLibrary;
/*    */ 
/*    */ import Reports.ExtentTestNGITestListener;
/*    */ import com.aventstack.extentreports.ExtentReports;
/*    */ import com.aventstack.extentreports.ExtentTest;
/*    */ import com.aventstack.extentreports.Status;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public class reportingFunctions
/*    */ {
/*    */   ExtentReports extent;
/*    */   ExtentTest test;
/*    */   
/*    */   public void logStepWithScreenShot(ExtentTest test, String stepDescription, Status status, String imagePath)
/*    */     throws IOException
/*    */   {
/* 18 */     extent = ExtentTestNGITestListener.extent;
/* 19 */     test.log(status, stepDescription).addScreenCaptureFromPath(imagePath, "Title");
/* 20 */     extent.flush();
/*    */   }
/*    */   
/*    */ 
/*    */   public void logStep(ExtentTest test, String stepDescription, Status status)
/*    */   {
/* 26 */     extent = ExtentTestNGITestListener.extent;
/* 27 */     test.log(status, stepDescription);
/* 28 */     extent.flush();
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     userLibrary.reportingFunctions
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */