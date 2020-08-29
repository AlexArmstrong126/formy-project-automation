import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alearmst/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbttn = driver.findElement(By.id("alert-button"));
        alertbttn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


        driver.quit();
    }
}
