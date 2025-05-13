package Test;

import Sayfalar.FormAnasayfa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FormDoldurmaTest {
    private WebDriver driver;
    private FormAnasayfa formAnasayfa;

    @BeforeEach
    void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        formAnasayfa=new FormAnasayfa(driver);
        driver.get("https://demoqa.com/automation-practice-form");

    }


    @Test
    void formDoldurTest() throws InterruptedException {
        formAnasayfa.elemanGozukeneKadarBekle(formAnasayfa.nameCss);
        formAnasayfa.yaziYaz(formAnasayfa.nameCss,"John");
        formAnasayfa.yaziYaz(formAnasayfa.lastNameCss, "Doe");
        formAnasayfa.yaziYaz(formAnasayfa.emailCss,"john.doe@example.com");
        formAnasayfa.elemanGozukeneKadarBekle(formAnasayfa.maleGenderRadioBtnCss);
        formAnasayfa.tusaTikla(formAnasayfa.maleGenderRadioBtnCss);
        formAnasayfa.yaziYaz(formAnasayfa.phoneNumberCss,"1551234567");
        formAnasayfa.tusaBasKombinasyon(formAnasayfa.dateOfBirthCss,Keys.CONTROL,"a");
        formAnasayfa.yaziYaz(formAnasayfa.dateOfBirthCss,"22 September 1995");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        formAnasayfa.yaziYaz(formAnasayfa.subjectsCss,"Computer Science");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        formAnasayfa.yaziYaz(formAnasayfa.subjectsCss,"Economics");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        formAnasayfa.yaziYaz(formAnasayfa.subjectsCss,"History");
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        formAnasayfa.elemanGozukeneKadarBekle(formAnasayfa.hobbiesSportCheckbxBtnCss);
        formAnasayfa.tusaTikla(formAnasayfa.hobbiesSportCheckbxBtnCss);
        formAnasayfa.tusaTikla(formAnasayfa.hobbiesMusicCheckbxBtnCss);
        formAnasayfa.tusaTikla(formAnasayfa.hobbiesReadingCheckbxBtnCss);
        formAnasayfa.elemanGozukeneKadarBekleId(formAnasayfa.uploadPictureBtnId);
        formAnasayfa.dosyaGonder(formAnasayfa.uploadPictureBtnId,formAnasayfa.path);
        formAnasayfa.yaziYaz(formAnasayfa.currentAdressCss,"789 Oak Street, Apartment 12B");
        formAnasayfa.jsTikla(formAnasayfa.submitBtnId);



    }
    @Test
    void test(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        formAnasayfa.jsTikla(formAnasayfa.submitBtnId);

    }



    void tearDown(){
        driver.close();
    }


}
