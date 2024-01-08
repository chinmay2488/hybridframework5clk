package scripts;

import org.testng.annotations.Test;

import chinmaykulkarni.baseclass;
import pompages.Skillrarydemoapp;
import pompages.addtocart;
import pompages.skillaryloginpage;

public class testcase1 extends baseclass {
	@Test
	public void tc1() {
		skillaryloginpage s=new skillaryloginpage(driver);
		s.gerasbutton();
		s.skillraryDemoapp();
		
		Skillrarydemoapp sd=new Skillrarydemoapp(driver);
		driverutilites.Switchingtabs(driver);
		driverutilites.mousehover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		addtocart ad=new addtocart(driver);
		driverutilites.doubleclick(driver, ad.getAddbtn());
		ad.addtocartbtn();
		driverutilites.alertpopup(driver);
	}

}
