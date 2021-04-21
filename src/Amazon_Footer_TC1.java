import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Footer_TC1 {

    public static void main(String[] args) {

// using  CSS Selector:

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon_PC\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://amazon.com");

     driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
    }
}