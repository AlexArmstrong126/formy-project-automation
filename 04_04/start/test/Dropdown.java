import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/alearmst/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));

        dropdownmenu.click();

        WebElement autoocomplete = driver.findElement(By.id("autocomplete"));
        autoocomplete.click();

        driver.quit();
    }
}
