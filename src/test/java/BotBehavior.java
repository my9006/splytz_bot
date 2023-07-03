import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

public class BotBehavior {

    @Test(dataProviderClass = PhoneNumbersDataProvider.class, dataProvider = "phoneNumbers")
    public void signUp(final String phoneNumber) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(30, ChronoUnit.SECONDS));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.of(100, ChronoUnit.SECONDS));
        driver.get("https://test-splytz-client.highwaybaas.com/sign-up");
        driver.get("https://sprintonline.am/sign-up");
//        driver.get("https://splytzclient.inecobank.am/sign-up");
//        driver.get("https://ineco-stg-splytz-frontclient.highway.works/sign-up");

        Thread.sleep(4000);

        final WebElement phoneNumberElement = driver.findElement(By.cssSelector("[type='tel']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(phoneNumberElement));
        phoneNumberElement.click();

        phoneNumberElement.sendKeys("44"+(100000+new Random().nextInt(99999)));

        final WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        webDriverWait.until(webDriver->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        Thread.sleep(5000);

        final List<WebElement> otp = driver.findElements(By.cssSelector("[type='number']"));
        otp.forEach(element->{
            element.click();
            element.sendKeys("0");
        });

        final WebElement verify = driver.findElement(By.cssSelector("[type='submit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(verify));
        verify.click();

        Thread.sleep(50000);
        driver.quit();

    }

    @Test(dataProviderClass = PhoneNumbersDataProvider.class, dataProvider = "phoneNumbers")
    public void login(final String phoneNumber) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(30, ChronoUnit.SECONDS));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.of(100, ChronoUnit.SECONDS));
        driver.get("https://dev-splytz-client.highwaybaas.com/login");
//        driver.get("https://splytzclient.inecobank.am/login");

        Thread.sleep(4000);

        final WebElement phoneNumberElement = driver.findElement(By.cssSelector("[type='tel']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(phoneNumberElement));
        phoneNumberElement.click();
        phoneNumberElement.sendKeys("77889900");
        final WebElement password = driver.findElement(By.cssSelector("[name='password']"));
        password.click();
        password.sendKeys("Test789*");

        final WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        webDriverWait.until(webDriver->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        Thread.sleep(50000);
        driver.quit();
    }

    @Test(dataProviderClass = PhoneNumbersDataProvider.class, dataProvider = "phoneNumbers")
    public void resetPassword(final String phoneNumber) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(30, ChronoUnit.SECONDS));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.of(100, ChronoUnit.SECONDS));
//        driver.get("https://dev-splytz-client.highwaybaas.com/login");
//        driver.get("https://splytzclient.inecobank.am/reset-password");
        driver.get("https://sprintonline.am/reset-password");

        Thread.sleep(4000);

        final WebElement phoneNumberElement = driver.findElement(By.cssSelector("[type='tel']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(phoneNumberElement));
        phoneNumberElement.click();
        phoneNumberElement.sendKeys("94800385");

        final WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        webDriverWait.until(webDriver->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        Thread.sleep(50000);
        driver.quit();
    }

    @Test(dataProviderClass = PhoneNumbersDataProvider.class, dataProvider = "phoneNumbers")
    public void resendOTP(final String phoneNumber) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(30, ChronoUnit.SECONDS));
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.of(100, ChronoUnit.SECONDS));
//        driver.get("https://dev-splytz-client.highwaybaas.com/login");
//        driver.get("https://splytzclient.inecobank.am/reset-password");
        driver.get("https://splytzclient.inecobank.am/reset-password");

        Thread.sleep(4000);

        final WebElement phoneNumberElement = driver.findElement(By.cssSelector("[type='tel']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(phoneNumberElement));
        phoneNumberElement.click();
        phoneNumberElement.sendKeys("77112233");

        final WebElement button = driver.findElement(By.cssSelector("[type='submit']"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        webDriverWait.until(webDriver->
                ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        Thread.sleep(50000);
        driver.quit();
    }


}
