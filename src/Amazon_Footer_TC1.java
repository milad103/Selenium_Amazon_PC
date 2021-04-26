import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Footer_TC1 {

    public static void main(String[] args) {

// using  CSS Selector:

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\Selenium_Amazon_PC\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://target.com");

     //driver.findElement(By.cssSelector("a[href='https://www.alexa.com']")).click();
     //driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[3]/td[5]/a")).click();
        driver.findElement(By.xpath("//a[@class='Link-sc-1khjl8b-0 kdCHb HeaderMainLink-sc-1tx0dwp-0 jFLtaS h-hidden-sm-down h-margin-l-tight']")).click();
        //class="Link-sc-1khjl8b-0 kdCHb HeaderMainLink-sc-1tx0dwp-0 jFLtaS h-hidden-sm-down h-margin-l-tight"
        driver.findElement(By.xpath("//div[@class='Button-bwu3xu-0 iDUtwC']")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[2]/a/div")).click();
        ////div[@class='Button-bwu3xu-0 iDUtwC']

    }
}