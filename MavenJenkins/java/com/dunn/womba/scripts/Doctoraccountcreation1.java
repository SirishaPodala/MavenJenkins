package com.dunn.womba.scripts;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.Doctorccountcreation;
import com.dunn.womba.pages.LoginPage;

public class Doctoraccountcreation1 extends Baselib {
	@Test
	
	public void Doctoraccountcreationone() throws InterruptedException
		{
			LoginPage lp = new LoginPage(driver);
		
		//String doc=excelLib.getData("Sheet1",1,0,Iconstants.DataexcelPath2);
			//String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
			//String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
			//lp.doLogin(un, pw);
			
			Doctorccountcreation obj=new Doctorccountcreation(driver);
			obj.docaccount();
			
			}
		}






