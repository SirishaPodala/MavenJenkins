package com.dunn.womba.smoketestscripts;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.smoketestpages.Forgetpassword;
import com.dunn.womba.smoketestpages.LoginPage;

public class Forget_password extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void forget() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		
		Forgetpassword fp=new Forgetpassword(driver);
	    fp.forget();  
		
		

	}

}

