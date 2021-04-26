import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class New_Egg_Footer_TC1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon_PC\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://newegg.com");

        driver.manage().window().maximize();

       List<WebElement> footerElements = driver.findElements(By.xpath("//div[@class='page-footer-inner nav-row']"));

        // Printing all Footer elements to the console
        for (WebElement footy : footerElements) {
            System.out.println(footy.getText());

        }
    }
}
