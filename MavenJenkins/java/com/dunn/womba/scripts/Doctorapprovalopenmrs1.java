package com.dunn.womba.scripts;
import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excelLib;
import com.dunn.womba.pages.Doctorapprovalopenmrs;
import com.dunn.womba.pages.LoginPage;

public class Doctorapprovalopenmrs1 extends Baselib {
	@Test
	
	public void Doctorapprovalopenmrsone() throws InterruptedException
		{
			//LoginPage lp = new LoginPage(driver);
		
		String doc=excelLib.getData("Sheet1",1,0,Iconstants.DataexcelPath);
			//String un = excelLib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
			//String pw = excelLib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
			//lp.doLogin(un, pw);
			
			Doctorapprovalopenmrs obj=new Doctorapprovalopenmrs(driver);
			obj.docapproval(doc);
			
			
			
			//String Actualtitle = driver.getTitle();
			//System.out.println("Title of Dashboard Page : " +Actualtitle);
			//String ExpectedTitle = excelLib.getData("Sheet1",3,1,Iconstants.Expectedoutput);
			//Assert.assertEquals(Actualtitle, ExpectedTitle);
			}
		}






