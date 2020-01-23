package stepDefinitions;

import Cucumber.Automantion.driverUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import java.io.IOException;


@RunWith(Cucumber.class)
public class MyStepDefenition extends driverUtil {


    @Given("^User is on GreenCart Landig page$")
    public void user_is_on_GreenCart_Landig_page() throws IOException {
        driverUtil.getDriver();
        //String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
        //driver.get(url);
    }

    @When("^User searched for \"([^\"]*)\" Vegetables\\.$")
    public void user_searched_for_Vegetables(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input")).sendKeys(arg1);
        Thread.sleep(5000);
    }

    @Then("^\"([^\"]*)\" results are displayed!$")
    public void results_are_displayed(String arg1) {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
        driver.close();

    }

    @Given("^Added items to chart$")
    public void added_items_to_chart() {

    }

    @Given("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_Checkout_page_for_purchase() {

    }

    @Then("^Verify selected \"([^\"]*)\" items are displayed in chekout page$")
    public void verify_selected_items_are_displayed_in_chek_out_page(String arg1) {

    }

}
