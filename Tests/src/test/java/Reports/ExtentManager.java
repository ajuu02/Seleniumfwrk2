/*    */ package Reports;
/*    */ 
/*    */ import com.aventstack.extentreports.ExtentReports;
/*    */ import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/*    */ import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
/*    */ 
/*    */ public class ExtentManager
/*    */ {
/*    */   private static ExtentReports extent;
/*    */   
/*    */   public static ExtentReports getInstance()
/*    */   {
/* 13 */     if (extent == null) {
/* 14 */       createInstance("test-output/extent.html");
/*    */     }
/* 16 */     return extent;
/*    */   }
/*    */   
/*    */   public static ExtentReports createInstance(String fileName) {
/* 20 */     ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
/* 21 */     htmlReporter.config().setTestViewChartLocation(com.aventstack.extentreports.reporter.configuration.ChartLocation.BOTTOM);
/* 22 */     htmlReporter.config().setChartVisibilityOnOpen(true);
/* 23 */     htmlReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);
/* 24 */     htmlReporter.config().setDocumentTitle(fileName);
/* 25 */     htmlReporter.config().setEncoding("utf-8");
/* 26 */     htmlReporter.config().setReportName(fileName);
/*    */     
/* 28 */     extent = new ExtentReports();
/* 29 */     extent.attachReporter(new com.aventstack.extentreports.ExtentReporter[] { htmlReporter });
/*    */     
/* 31 */     return extent;
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     Reports.ExtentManager
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */