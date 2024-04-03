import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable {
        public static void main(String[] args) {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishw\\OneDrive\\Desktop\\Intellij\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Open a website
            driver.get("https://www.facebook.com/");






        }
    }

