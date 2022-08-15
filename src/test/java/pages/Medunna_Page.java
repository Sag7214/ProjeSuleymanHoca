package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Medunna_Page {

    public Medunna_Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    // kadir TEPECİK

    @FindBy (xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultButonu;
    @FindBy (xpath = "//button[@class='btn btn-warning btn-sm']")
    public WebElement requestInpatientButonu;
    @FindBy(xpath = "//div[text()='InPatient request already done for this appointment']")
    public WebElement inpatientMessage;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement inpatientMessage2;

    @FindBy(xpath = "//div[@class='btn-group flex-btn-group-container']")
    public  WebElement viewResults;
    @FindBy(xpath = "//table[@class='table']//thead//tr//th")
    public  List<WebElement> testSonuclarıBaslıkları;
    @FindBy (xpath = "//table[@class='table']//tr")
    public  List<WebElement> testSonuclarıListesi;





    // EMRE KARASU


    //HATİCE ERKAN

    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton1;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointment;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public List<WebElement> editList;


    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusMenu;

    @FindBy(xpath = "//option[@value='PENDING']")
    public WebElement pending;

    @FindBy(xpath = "//option[@value='COMPLETED']")
    public WebElement completed;

    @FindBy(xpath = "//option[@value='CANCELLED']")
    public WebElement cancelled;

    @FindBy(xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-prescription']")
    public WebElement prescriptionTextBox;

    @FindBy(xpath = "//textarea[@id='appointment-description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement allertYazi;

    @FindBy(xpath = "//table[@class='table']//tbody//tr")
    public List<WebElement> patientList;

    @FindBy(xpath = "//table[@class='table']//tbody//tr[1]//td")
    public List<WebElement> patient;



    // adilGULACTI

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

    @FindBy(className = "alert alert-danger fade show")
    public WebElement errorMesaji;























}
