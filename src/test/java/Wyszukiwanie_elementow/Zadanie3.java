package Wyszukiwanie_elementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signInLink = driver.findElement(By.className("user_login"));
        signInLink.click();
        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.sendKeys("random@test.com");
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.submit();

        driver.quit();
    }
}
