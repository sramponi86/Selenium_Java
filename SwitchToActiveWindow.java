import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/diabomba/Desktop/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement new_tab = driver.findElement(By.id("new-tab-button"));
        new_tab.click();

        String original_handle = driver.getWindowHandle();
        for (String handle1: driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(original_handle);

        driver.quit();
    }
}
