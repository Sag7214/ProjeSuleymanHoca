package stepDefinitions.UI_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Medunna_Page;
import utilities.Driver;

public class US_004 {
    Medunna_Page medunnaPage = new Medunna_Page();

    @When("giris icin giris ikonuna tiklar")
    public void giris_icin_giris_ikonuna_tiklar() {
        medunnaPage.accountMenu.click();
    }

    @When("ana sayfa Sign In butonuna tiklar")
    public void ana_sayfa_sign_in_butonuna_tiklar() {
        medunnaPage.signInButton1.click();
    }

    @When("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        medunnaPage.usernameTextBox.click();
        medunnaPage.usernameTextBox.sendKeys(username);
    }

    @When("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        medunnaPage.passwordTextBox.click();
        medunnaPage.passwordTextBox.sendKeys(password);
    }

    @Then("kullanici sisteme giris yapar")
    public void kullanici_sisteme_giris_yapar() {
        medunnaPage.signInButton2.click();
    }

    @When("beni hatirla secenegini gorur")
    public void beni_hatirla_secenegini_gorur() {
        medunnaPage.rememberMe.isDisplayed();
    }

    @When("Did you forget your password secenegini gorur")
    public void did_you_forget_your_password_secenegini_gorur() {
        medunnaPage.forgetPassword.isDisplayed();
    }

    @When("Register a new Account secenegini gorur")
    public void register_a_new_account_secenegini_gorur() {
        medunnaPage.registerNewAccount.isDisplayed();
    }

    @When("Cancel buttonunu gorur")
    public void cancel_buttonunu_gorur() {
        medunnaPage.cancelButton.isDisplayed();
    }

    @And("uygulamayi kapatir")
    public void uygulamayiKapatir() {
        Driver.getDriver().close();
    }

    @And("SignIn butonuna tiklar")
    public void signinButonunaTiklar() {
        medunnaPage.signInButton.click();
    }

    @Then("kullanici uygulamaya {string} olarak giris yapar")
    public void kullaniciUygulamayaOlarakGirisYapar(String expectedUserName) {
        String aktuelDeger = medunnaPage.kullaniciAdi.getText().trim();
        aktuelDeger = aktuelDeger.replace(" ", "");
        Assert.assertEquals(expectedUserName, aktuelDeger);
    }

    @Then("{string} mesajini gorur")
    public void mesajiniGorur(String bosUserNameMesaji) {
       // Assert.assertTrue(medunnaPage.errorMesaji.isDisplayed());
        Assert.assertEquals(medunnaPage.errorMesaji.getText(),bosUserNameMesaji);

    }
}
