package stepDefinitions.UI_stepdefinitions;

import base_urls.Medunna_baseUrl;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import pages.Medunna_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011 extends Medunna_baseUrl {

    Medunna_Page medunnaPage= new Medunna_Page();
    SoftAssert softAssert= new SoftAssert();

    @Given("Kullanici  {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("account menuye tiklar")
    public void account_menuye_tiklar() {
    medunnaPage.accountMenu.click();
    }

    @Given("Sign In butonuna tiklar")
    public void sign_ın_butonuna_tiklar() {
    medunnaPage.signInButton1.click();
    }

    @Given("Username bilgisini girer")
    public void username_bilgisini_girer() {
        medunnaPage.usernameTextBox.sendKeys(ConfigReader.getProperty("physicionUsername"));
    }

    @Given("Password bilgisini girer")
    public void password_bilgisini_girer() {
        medunnaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("physicionPassword"));
        medunnaPage.rememberMeButton.click();
    }

    @Given("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() throws InterruptedException {
        medunnaPage.signInButton2.click();
        Thread.sleep(2000);
    }

    @Given("My Pages butonuna tiklar")
    public void my_pages_butonuna_tiklar() {
        medunnaPage.myPages.click();
    }
    @Given("My Appointments secenegine tiklar")
    public void my_appointments_secenegine_tiklar() {
        medunnaPage.myAppointment.click();
    }

    @Given("Edit butonuna tiklar")
    public void edit_butonuna_tiklar() {
        medunnaPage.editList.get(0).click();
    }

    @Given("id, start and end date, Status, physician and patient bilgilerini dogrular")
    public void id_start_and_end_date_status_physician_and_patient_bilgilerini_dogrular() {
       //softAssert.assertTrue(medunnaPage.idTextBox.isDisplayed());
    }

    @Given("Status bolumundeki bilgiyi secer")
    public void status_bolumundeki_bilgiyi_secer() {

    }
    @Given("Anamnesis bolumundeki bilgiyi doldurur \\/Zorunlu")
    public void anamnesis_bolumundeki_bilgiyi_doldurur_zorunlu() {

    }
    @Given("Treatment bolumundeki bilgiyi doldurur \\/Zorunlu")
    public void treatment_bolumundeki_bilgiyi_doldurur_zorunlu() {

    }
    @Given("Diagnosis  bolumundeki bilgiyi doldurur \\/Zorunlu")
    public void diagnosis_bolumundeki_bilgiyi_doldurur_zorunlu() {

    }
    @Given("Prescription bolumundeki bilgiyi doldurur \\/Istege bagli")
    public void prescription_bolumundeki_bilgiyi_doldurur_ıstege_bagli() {

    }
    @Given("Description bolumundeki bilgiyi doldurur \\/Istege bagli")
    public void description_bolumundeki_bilgiyi_doldurur_ıstege_bagli() {

    }
    @Given("Save secenegine tiklar")
    public void save_secenegine_tiklar() {

    }
    @Given("Basarili bir sekilde kaydedildigini kontrol eder")
    public void basarili_bir_sekilde_kaydedildigini_kontrol_eder() {

    }


}
