package PageObjects;

import TestBase.TestBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends TestBaseClass {
    @FindBy(xpath = "//*[@placeholder='Enter your email address / username']")
    WebElement username_field;
    @FindBy(xpath = "//*[@placeholder='Enter your Password']")
    WebElement password_field;

    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement signin_button_field;

    @FindBy(xpath = "//*[text()='Welcome']")
    WebElement welcome_text;

    public loginPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void logIn()
    {
        username_field.sendKeys("release3410lea1@mailinator.com");
        password_field.sendKeys("Test@123");

//        SendingInvitationTest
    }
    public void clickButton(){
        signin_button_field.click();
//        String text= "//*[text()='Welcome']";
//        String comparewelcome = "Welcome";
//        if(text.equals(comparewelcome))
//        {
//            System.out.println("Successfull login");
//        }
//        else{
//            System.out.println("Unsuccessfull login");
//        }
    }
}
