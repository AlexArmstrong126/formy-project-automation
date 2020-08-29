import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/alearmst/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
        fileuploadfield.sendKeys("file-to-upload.png");

        Thread.sleep(5000);

        WebElement clear = driver.findElement(By.cssSelector(".btn.btn-warning.btn-reset"));
        clear.click();


        driver.quit();
    }
}
