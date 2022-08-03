package Scripts;

import org.testng.annotations.Test;

import com.dunn.womba.init.Iconstants;
import com.dunn.womba.lib.Baselib;
import com.dunn.womba.lib.excellib;

import Pom_pages.LoginPage;



public class DoctorLogin extends Baselib{
	@Test
	public void doctorlogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		String un = excellib.getData("Sheet1",2,1,Iconstants.DataexcelPath);
		String pw = excellib.getData("Sheet1",2,2,Iconstants.DataexcelPath);
		lp.doctorlogin(un, pw);
}
}
