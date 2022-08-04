package runner;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class;
import pages.BookSingleFlight;
import pages.FlightMultiCity;
import pages.PaymentPage;
import pages.ReviewPage;
import pages.TravellersPage;

import org.testng.annotations.Test;


public class FlightMultiCityRunner extends BasePage 
{
    @Test
    public void flightSearch() throws Exception 
    {
      

        FlightMultiCity fmc = new FlightMultiCity(driver);
        BookSingleFlight bsf=new BookSingleFlight(driver);
        ReviewPage rp=new ReviewPage(driver);
        TravellersPage tp = new TravellersPage(driver);
        
        fmc.clickPath();
        String city1 = Utility_Class.getpfdata(1, 0, "Flight");
        fmc.source(city1);
        
        String city2 = Utility_Class.getpfdata(1, 1, "Flight");
        fmc.destination1(city2);
        
        String city4 = Utility_Class.getpfdata(1, 2, "Flight");
        fmc.destination2(city4);
        
        String sourceMonth = Utility_Class.getpfdata(1, 3, "Flight");
        String sourceDate = Utility_Class.getpfdata(1, 4, "Flight");
        fmc.departuredate1(sourceMonth,sourceDate);
        
        String departureMonth2 = Utility_Class.getpfdata(1, 5, "Flight");
        String departureDate2 = Utility_Class.getpfdata(1, 6, "Flight");
        fmc.departuredate2(departureMonth2,departureDate2);
                
        fmc.travellerEconomy();
        
        fmc.searchFlight();
        
        bsf.testBookNow();
        String emailid = Utility_Class.getpfdata(1, 10, "Flight");
        rp.testemailaddress(emailid);
        rp.testContinueBookingButton();
        
        tp.testTitle();
        tp.testFirstName(Utility_Class.getpfdata(1, 12, "Flight"));
        tp.testLastName(Utility_Class.getpfdata(1, 13, "Flight"));
        
        tp.testSeatMap();
        tp.testSelectSeat();
        
        tp.testContactDetails(Utility_Class.getpfdata(1, 14, "Flight"));
       // tp.testCheckBox();
        tp.testContinuesBtn();
        
        PaymentPage pp=new PaymentPage(driver);
        pp.testnetBanking();
        pp.testselectBank();
        pp.testmakePayment();
        
        
        
        
        
    }
}
