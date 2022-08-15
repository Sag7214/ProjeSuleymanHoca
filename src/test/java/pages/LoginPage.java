package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // adilGULACTI

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;



    @And("uygulamayi kapatir")
    public void uygulamayiKapatir() {
        Driver.getDriver().close();
    }


    @FindBy(xpath = "//button/span[text()='Sign in']")
    public WebElement signInButton;


    @FindBy(xpath="//div/button/span[text()= \"Cancel\"]")
    public WebElement cancelButton;


    @FindBy(xpath="//span[text()= \"hasta Adil\"]")
    public WebElement kullaniciAdi;


    @FindBy(xpath = "//span[normalize-space()='Remember me']")
    public WebElement rememberMe;

    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public WebElement forgetPassword;

    @FindBy(xpath = "//div[@role='dialog']//div[4]")
    public WebElement registerNewAccount;







}

