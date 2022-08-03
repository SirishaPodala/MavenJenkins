package com.dunn.womba.scripts;
import org.testng.annotations.Test;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.pages.ForgetpasswordINSURANCE;
import com.dunn.womba.pages.LoginPage;

public class ForgetpasswordINSURANCE1 extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void forget() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		//String un = excelLib.getData("Sheet2",2,1,Iconstants.DataexcelPath);
		//String pw = excelLib.getData("Sheet2",2,2,Iconstants.DataexcelPath);
		//lp.doLogin(un, pw);
		
		ForgetpasswordINSURANCE obj=new ForgetpasswordINSURANCE(driver);
		
	    obj.forget();  //calling method here//
		
		

	}

}

