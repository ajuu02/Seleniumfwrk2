/*    */ package userLibrary;
/*    */ 
/*    */ import com.aventstack.extentreports.ExtentTest;
/*    */ import com.aventstack.extentreports.Status;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class commonFunctions
/*    */   extends objectFunctions
/*    */ {
/*    */   protected void successMessageFunction(ExtentTest test)
/*    */   {
/* 16 */     logStep(test, "Inside OtherFunctions successMessageFunction", Status.PASS);
/*    */   }
/*    */   
/*    */ 
/*    */   protected void failureMessageFunction(ExtentTest test)
/*    */   {
/* 22 */     logStep(test, "Inside OtherFunctions failureMessageFunction", Status.FAIL);
/*    */   }
/*    */ }

/* Location:           /Users/KishoreNegi/Desktop/Jar.jar
 * Qualified Name:     userLibrary.commonFunctions
 * Java Class Version: 8 (52.0)
 * JD-Core Version:    0.7.1
 */