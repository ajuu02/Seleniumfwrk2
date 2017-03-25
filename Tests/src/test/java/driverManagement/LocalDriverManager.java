/*    */ package driverManagement;
/*    */ 
/*    */ import org.openqa.selenium.WebDriver;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LocalDriverManager
/*    */ {
/* 10 */   private static ThreadLocal<WebDriver> webDriver = new ThreadLocal();
/*    */   
/*    */ 
/*    */   public static WebDriver getDriver()
/*    */   {
/* 15 */     return (WebDriver)webDriver.get();
/*    */   }
/*    */   
/*    */   static void setWebDriver(WebDriver driver) {
/* 19 */     webDriver.set(driver);
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     driverManagement.LocalDriverManager
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */