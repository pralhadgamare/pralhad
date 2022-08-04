package runner;

import org.testng.annotations.Test;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class;
import pages.FlightMultiCity;
import pages.MultipleFlight;

public class MultipleFlightRunner extends BasePage {
	@Test
	    public void multipleflightSearch() throws Exception 
	    {
	      

	        MultipleFlight mf = new MultipleFlight(driver);;
	        for(int i = 1; i <= Utility_Class.getRow("Flight"); i++ ) 
	        {
	        mf.clickPath();
	        String city1 = Utility_Class.getpfdata(i, 0, "Flight");
	        mf.source(city1);
	        
	        String city2 = Utility_Class.getpfdata(i, 1, "Flight");
	        mf.destination1(city2);
	        
	        String city4 = Utility_Class.getpfdata(i, 2, "Flight");
	        mf.destination2(city4);
	        
	        String sourceMonth = Utility_Class.getpfdata(i, 3, "Flight");
	        String sourceDate = Utility_Class.getpfdata(i, 4, "Flight");
	        mf.departuredate1(sourceMonth,sourceDate);
	        
	        String departureMonth2 = Utility_Class.getpfdata(i, 5, "Flight");
	        String departureDate2 = Utility_Class.getpfdata(i, 6, "Flight");
	        mf.departuredate2(departureMonth2,departureDate2);
	                
	        mf.travellerEconomy(i);
	        
	        mf.searchFlight();
	        mf.clickOnLogo();
	    }
}
}
