package Scripts;
import org.testng.annotations.Test;
import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excellib;

import Pom_pages.Bulkrequest;
import Pom_pages.LoginPage;


public class Bulk_request extends Baselib
{
//TODO Auto-generated constructor stub
	
@Test

public  void InsuranceBulkrequestone() throws InterruptedException  //JVM will handle exception here//
	{
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage(driver);
		String un = excellib.getData("Sheet1",3,1,Iconstants.DataexcelPath);
		String pw = excellib.getData("Sheet1",3,2,Iconstants.DataexcelPath);
		lp.InsuranceLogin(un, pw);
		
		Bulkrequest br=new Bulkrequest(driver);
		br.bulkrequest();  
		
		

	}

}
