/*    */ package Reports;
/*    */ 
/*    */ import com.aventstack.extentreports.ExtentReports;
/*    */ import org.testng.ITestContext;
/*    */ import org.testng.ITestListener;
/*    */ import org.testng.ITestResult;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExtentTestNGITestListener
/*    */   implements ITestListener
/*    */ {
/* 20 */   public static ExtentReports extent = ExtentManager.createInstance("extent.html");
/*    */   
/*    */   public synchronized void onStart(ITestContext context) {}
/*    */   
/*    */   public synchronized void onFinish(ITestContext context) {}
/*    */   
/*    */   public synchronized void onTestStart(ITestResult result) {}
/*    */   
/*    */   public synchronized void onTestSuccess(ITestResult result) {}
/*    */   
/*    */   public synchronized void onTestFailure(ITestResult result) {}
/*    */   
/*    */   public synchronized void onTestSkipped(ITestResult result) {}
/*    */   
/*    */   public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     Reports.ExtentTestNGITestListener
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */