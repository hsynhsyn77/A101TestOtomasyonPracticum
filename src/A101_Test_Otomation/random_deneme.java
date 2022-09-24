package A101_Test_Otomation;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class random_deneme extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement skillsDropdown=driver.findElement(By.id("Skills"));
        Select skills=new Select(skillsDropdown);

        int dropdownValuesCount=driver.findElements(By.cssSelector("#Skills>option")).size();

        Random random = new Random();
        int index=random.nextInt(dropdownValuesCount);

        skills.selectByIndex(index);




    }

}
