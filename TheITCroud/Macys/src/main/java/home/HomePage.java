package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    //write code for homepage
    public void clickingOnDropdown(){
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
    }
}
