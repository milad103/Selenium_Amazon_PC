import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class New_Egg_Footer_TC2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon_PC\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://newegg.com");

        List<WebElement> footerElementz = driver.findElements(By.cssSelector("ul[ class='nav-col first']"));

        for (WebElement footy1 : footerElementz) {
            System.out.println(footy1.getText());


            ////a[@title='for your business']
        }
    }
}
