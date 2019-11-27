package com.techtorial.Pages;

import com.techtorial.UTILS.UtilsDRY;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class Bonanza {
    static WebDriver driver;

    @BeforeClass
    public void setup(){
        driver =UtilsDRY.driverSetup("chrome");
        PageFactory.initElements(driver,this);

    }

    @FindBy(css="#q_search_term")
    public WebElement searchField;


}
    /*lay out #home_controller
        side wrpper #site_wrapper
        searchfield #q_search_term
        SEARCH BUTTON #home_search_box
        send keys nike womean
        click #i_item-777681342
        #add_to_cart
        gotoCart .go_to_cart_button
        input zip .checkout_zip
        click and send keys #checkout_user_email

        click on check mark #checkout_user_email_consent

        click .keep_browsing*/

