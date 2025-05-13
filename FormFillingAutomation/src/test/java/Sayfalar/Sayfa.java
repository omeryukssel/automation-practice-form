package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void elemanGozukeneKadarBekle(String css){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));

    }

    public void elemanGozukeneKadarBekleId(String id){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));

    }

    public void tusaTikla(String css){
        driver.findElement(By.cssSelector(css)).click();
    }


    public void yaziYaz(String css,String yazi){
        driver.findElement(By.cssSelector(css)).sendKeys(yazi);
    }

    public void tusaBas(String css, Keys klavyeTusu){
        driver.findElement(By.cssSelector(css)).sendKeys(klavyeTusu);
    }
    public void tusaBasKombinasyon(String css, Keys klavyeTusu, String harf) {
        driver.findElement(By.cssSelector(css)).sendKeys(Keys.chord(klavyeTusu, harf));
    }

    public void dosyaGonder(String id,String path){
        driver.findElement(By.id(id)).sendKeys(path);
    }

    public void jsTikla(String id){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.id(id)));
    }






}
