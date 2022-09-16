package Deneme;


import Utils.BaseStaticDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class denemeclass extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.a101.com.tr/");
        WebElement kabulEt = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        kabulEt.click();

        // WebElement popUp = driver.findElement(By.xpath("//div[contains(text(),'X')]"));
        // popUp.click();
        WebElement giyimAks = driver.findElement(By.cssSelector("[title='GİYİM & AKSESUAR']"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(giyimAks).build().perform();
        WebElement dızAltCrp = driver.findElement(By.linkText("Dizaltı Çorap"));
        aksiyonlar.moveToElement(dızAltCrp).build().perform();
        dızAltCrp.click();

        WebElement syhCrp = driver.findElement(By.cssSelector("[value='SİYAH']"));
        syhCrp.click();
        WebElement syhCrp2 = driver.findElement(By.xpath("//div[@class='product-actions']"));
        syhCrp2.click();

        WebElement mesaj = driver.findElement(By.xpath("//div[@class='product-heading']"));
       // Assert.("Form submited Successfully!");

        //   //div[@class='product-heading']
        WebElement sepeteEkle = driver.findElement(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
        sepeteEkle.click();
        WebElement dEt = driver.findElement(By.linkText("Sepeti Görüntüle"));
        dEt.click();
        WebElement sptOny = driver.findElement(By.linkText("Sepeti Onayla"));
        sptOny.click();
        WebElement üOlmDet = driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET"));
        üOlmDet.click();
        WebElement mail = driver.findElement(By.xpath("//input[@name='user_email']"));
        mail.sendKeys("huseyin77@gmail.com");
        WebElement mailBtn = driver.findElement(By.xpath("//button[@class='button block green']"));
        mailBtn.click();
        WebElement nevAdress = driver.findElement(By.xpath("//a[@class='new-address js-new-address']"));
        nevAdress.click();
        WebElement adressBas = driver.findElement(By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']"));
        adressBas.sendKeys("Ev");
        WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
        name.sendKeys("huseyin");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("huseyin");
        WebElement phoneNu = driver.findElement(By.xpath("//input[@name='phone_number']"));
        phoneNu.sendKeys("5552325060");

        WebElement cityMenu = driver.findElement(By.xpath("//select[@class='js-cities']"));
        Select city = new Select(cityMenu);
        city.selectByVisibleText("İZMİR");
        WebElement districtMenu = driver.findElement(By.xpath(" //select[@class='js-township']"));
        Select district = new Select(districtMenu);
        district.selectByVisibleText("KARABAĞLAR");
        WebElement neighbourhoodMenu = driver.findElement(By.xpath(" //select[@class='js-district']"));
        Select neighbourhoodt = new Select(neighbourhoodMenu);
        neighbourhoodt.selectByValue("36911");

        WebElement adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        adress.sendKeys(" adres  bahar mh. 10 sk. no:3 d:5 karabağlar / İZMİR");
        WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
        postcode.sendKeys(" 35000");
        // WebElement save = driver.findElement(By.xpath("(//button[@type='button'])[6] "));
        // save.click();
        WebElement saveGo = driver.findElement(By.xpath("//button[@data-index='1']"));
        saveGo.click();

           WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[6] ")));
           save.click();
        driver.quit();
    }
}
