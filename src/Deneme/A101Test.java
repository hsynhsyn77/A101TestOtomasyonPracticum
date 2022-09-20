package Deneme;


import Utils.BaseStaticDriver;
import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_zh_CN;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import java.util.Random;


public class A101Test extends BaseStaticDriver {
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
        Assert.assertTrue("siyah çorap seçildi", driver.findElement(By.cssSelector("[class='selected-variant-text'] span")).getText().toLowerCase().contains("siyah"));
        WebElement addToBasket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']")));
        addToBasket.click();
        WebElement viewCart = driver.findElement(By.linkText("Sepeti Görüntüle"));
        viewCart.click();
        WebElement cartCheck = driver.findElement(By.linkText("Sepeti Onayla"));
        cartCheck.click();
        WebElement goOn = driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET"));
        goOn.click();
        WebElement emailTextBx = driver.findElement(By.xpath("//input[@name='user_email']"));
        emailTextBx.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        emailTextBx.sendKeys("username" + randomInt + "@gmail.com");
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
        district.selectByVisibleText("BORNOVA");
        actions.sendKeys(Keys.TAB).build().perform();
        WebElement neighbourhoodMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='district']")));
        actions.moveToElement(neighbourhoodMenu).sendKeys(Keys.ENTER).build().perform();
        Select neighbour = new Select(neighbourhoodMenu);
        neighbour.selectByVisibleText("ATATÜRK MAH");
        actions.sendKeys(Keys.TAB).build().perform();
        WebElement adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        adress.sendKeys("A101 mh. 11 sk. no:3 d:5 \nKarabağlar / IZMIR");
        actions.sendKeys(Keys.TAB).build().perform();
        WebElement save = driver.findElement(By.xpath("//button[@class='button green js-set-country js-prevent-emoji'] "));
        save.click();
        WebElement scotty = driver.findElement(By.xpath("//ul[@class='js-shipping-list']"));
        scotty.click();
        WebElement saveGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button block green js-proceed-button']")));
        saveGo.click();
        WebElement cardNameLast = driver.findElement(By.xpath(" (//input[@name='name'])[2]"));
        cardNameLast.sendKeys("Billy Henderson");
        WebElement cardNo = driver.findElement(By.xpath(" //input[@class='js-masterpassbin-payment-card']"));
        cardNo.sendKeys("4121707792006419,");
        WebElement cardMonth = driver.findElement(By.xpath(" (//select[@name='card_month'])[2]"));
        Select cardmnth = new Select(cardMonth);
        cardmnth.selectByVisibleText("4");
        WebElement cardYear = driver.findElement(By.xpath(" (//select[@name='card_year'])[2]"));
        Select cardYr = new Select(cardYear);
        cardYr.selectByVisibleText("2026");
        WebElement cvc = driver.findElement(By.xpath(" (//input[@name='card_cvv'])[2]"));
        cvc.sendKeys("132");
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.SPACE).build().perform();
        WebElement ordercomp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" (//div[@id='js-orders-complete-button']//button)[2]")));
        ordercomp.click();
        wait.until(ExpectedConditions.urlContains("master"));
        Assert.assertTrue("ödeme sayfasına geçildi", driver.getCurrentUrl().contains("master"));
        driver.quit();
    }

}

