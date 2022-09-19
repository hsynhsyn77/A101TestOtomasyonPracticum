package Deneme;


import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class denemeclass extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.a101.com.tr/");
        WebElement kabulEt = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        kabulEt.click();
        WebElement giyimAks = driver.findElement(By.cssSelector("[title='GİYİM & AKSESUAR']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(giyimAks).build().perform();
        WebElement dızAltCrp = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dizaltı Çorap")));
        actions.moveToElement(dızAltCrp).build().perform();
        dızAltCrp.click();
        WebElement syhCrp = driver.findElement(By.cssSelector("[value='SİYAH']"));
        syhCrp.click();
        WebElement syhCrp2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-actions']")));
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
        district.selectByVisibleText("FOÇA");
//      --------------------------------------------------
        WebElement neighbourhoodMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='district']")));
        actions.moveToElement(neighbourhoodMenu).sendKeys(Keys.ENTER).build().perform();
        Select neighbour = new Select(neighbourhoodMenu);
        neighbour.selectByIndex(4);// HER SEFERİNDE MAHALLEYİ DEĞİŞTİRMEK GEREK YOKSA 2.DE ÇALIŞMIYOR (LİST ATILABİLİRMİ YADA RANDOM?????)


//      --------------------------------------------------aksiyon koydum buraya öyle mahalleyi seçiyor--------------------
        actions.sendKeys(Keys.TAB).build().perform();
        WebElement adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        adress.sendKeys("A101 mh. 10 sk. no:3 d:5 \nKarabağlar / IZMIR");
        actions.sendKeys(Keys.TAB).build().perform();
        WebElement postcode = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='postcode']")));
        postcode.sendKeys("35000");
        actions.sendKeys(Keys.TAB).build().perform();
        //WebElement save = driver.findElement(By.xpath("//button[@class='button green js-set-country js-prevent-emoji'] "));
        //save.click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button green js-set-country js-prevent-emoji'] ")));
        actions.sendKeys(Keys.ENTER).build().perform();
        WebElement saveGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Kaydet ve Devam Et')]")));
        actions.sendKeys(Keys.ENTER).build().perform();
        saveGo.click();
        WebElement cardNameLast = driver.findElement(By.xpath(" (//input[@name='name'])[2]"));
        cardNameLast.sendKeys("huseyın");
        WebElement cardNo = driver.findElement(By.xpath(" //input[@class='js-masterpassbin-payment-card']"));
        cardNo.sendKeys("1234432154323243");
        WebElement cardMonth = driver.findElement(By.xpath(" (//select[@name='card_month'])[2]"));
        Select cardmnth = new Select(cardMonth);
        cardmnth.selectByVisibleText("1");
        WebElement cardYear = driver.findElement(By.xpath(" (//select[@name='card_year'])[2]"));
        Select cardYr = new Select(cardYear);
        cardYr.selectByVisibleText("2025");
        WebElement cvc = driver.findElement(By.xpath(" (//input[@name='card_cvv'])[2]"));
        cvc.sendKeys("143");
        WebElement szl = driver.findElement(By.xpath(" //label[@for='agrement2']"));
        szl.click();
        //driver.quit();
    }
}
