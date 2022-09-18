package Deneme;


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class denemeclass extends BaseStaticDriver {
    public static void main(String[] args)  {


        driver.get("https://www.a101.com.tr/");
        WebElement kabulEt = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        kabulEt.click();

        WebElement giyimAks = driver.findElement(By.cssSelector("[title='GİYİM & AKSESUAR']"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.moveToElement(giyimAks).build().perform();
        WebElement dızAltCrp = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dizaltı Çorap")));
        aksiyonlar.moveToElement(dızAltCrp).build().perform();
        dızAltCrp.click();

        WebElement syhCrp = driver.findElement(By.cssSelector("[value='SİYAH']"));
        syhCrp.click();
        WebElement syhCrp2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='product-actions'])[1]")));
        syhCrp2.click();

        Assert.assertTrue(driver.findElement(By.cssSelector("[class='selected-variant-text'] span")).getText().toLowerCase().contains("siyah"));


        WebElement addToBasket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']")));
        addToBasket.click();
        WebElement viewCart = driver.findElement(By.linkText("Sepeti Görüntüle"));
        viewCart.click();
        WebElement cartCheck = driver.findElement(By.linkText("Sepeti Onayla"));
        cartCheck.click();
        WebElement goOn = driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET"));
        goOn.click();
        WebElement mail = driver.findElement(By.xpath("//input[@name='user_email']"));
        mail.sendKeys("huseyin77@gmail.com");
        WebElement mailBtn = driver.findElement(By.xpath("//button[@class='button block green']"));
        mailBtn.click();
        WebElement nevAdress = driver.findElement(By.xpath("//a[@class='new-address js-new-address']"));
        nevAdress.click();
        WebElement adressBas = driver.findElement(By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']"));
        adressBas.sendKeys("Ev");
        WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
        name.sendKeys("HUSEYIN");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("HUSEYIN");
        WebElement phoneNu = driver.findElement(By.xpath("//input[@name='phone_number']"));
        phoneNu.sendKeys("5552325060");

        WebElement cityMenu = driver.findElement(By.xpath("//select[@class='js-cities']"));
        Select city = new Select(cityMenu);
        city.selectByVisibleText("İZMİR");

        WebElement districtMenu = driver.findElement(By.xpath(" //select[@class='js-township']"));
        Select district = new Select(districtMenu);
        district.selectByVisibleText("KARABAĞLAR");


//      --------------------------------------------------
        WebElement neighbourhoodMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='district']")));
        aksiyonlar.moveToElement(neighbourhoodMenu).build().perform();
        Select neighbour = new Select(neighbourhoodMenu);
        neighbour.selectByVisibleText("VATAN MAH");
//      --------------------------------------------------



        WebElement adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        adress.sendKeys("bilinen mh. 10 sk. no:3 d:5 \nKarabağlar / IZMIR");
        WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
        postcode.sendKeys(" 35000");


        WebElement save2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[6] ")));
        save2.click();

        WebElement mngBtn = driver.findElement(By.xpath("//span[contains(text(),'MNG Kargo')]"));
        mngBtn.click();

        WebElement saveGo = driver.findElement(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]"));
        saveGo.click();
        driver.quit();
    }
}
