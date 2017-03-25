/*    */ package driverManagement;
/*    */ 
/*    */ import org.openqa.selenium.WebDriver;
/*    */ import org.openqa.selenium.chrome.ChromeDriver;
/*    */ import org.openqa.selenium.firefox.FirefoxDriver;
/*    */ import org.openqa.selenium.ie.InternetExplorerDriver;
/*    */ import org.openqa.selenium.remote.DesiredCapabilities;
/*    */ 
/*    */ 
/*    */ 
/*    */ class LocalDriverFactory
/*    */ {
/*    */   static WebDriver createInstance(String browserName, String driverPath)
/*    */   {
/* 15 */     WebDriver driver = null;
/* 16 */     if (browserName.toLowerCase().contains("firefox"))
/*    */     {
/* 18 */       driver = new FirefoxDriver();
/* 19 */       return driver;
/*    */     }
/* 21 */     if (browserName.toLowerCase().contains("internet"))
/*    */     {
/* 23 */       driver = new InternetExplorerDriver();
/* 24 */       return driver;
/*    */     }
/* 26 */     if (browserName.toLowerCase().contains("chrome")) {
/* 27 */       System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
/* 28 */       DesiredCapabilities Capability = DesiredCapabilities.chrome();
/* 29 */       Capability.setBrowserName("chrome");
/*    */       
/* 31 */       driver = new ChromeDriver(Capability);
/* 32 */       return driver;
/*    */     }
/* 34 */     return driver;
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     driverManagement.LocalDriverFactory
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */