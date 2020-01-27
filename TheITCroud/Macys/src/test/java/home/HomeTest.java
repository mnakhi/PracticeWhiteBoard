package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    //write test for macy's home page
    @Test
    public void testUserAbleToClickOnDropdownMenu(){
        driver.get("https://www.macys.com/");
        HomePage hm =new HomePage();
        hm.clickingOnDropdown();
    }
}
