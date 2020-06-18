import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "d:\\dev\\automation\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com");

        WebElement inputField1 = driver.findElement(By.id("gh-ac"));
        inputField1.sendKeys("laptop");
        inputField1.submit();

        driver.quit();
    }
}
