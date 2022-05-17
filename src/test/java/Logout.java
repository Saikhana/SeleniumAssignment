// import org.junit.*;
// import io.github.bonigarcia.wdm.WebDriverManager;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import org.openqa.selenium.By;
// import org.openqa.selenium.NoSuchElementException;
// import java.util.*;  

// public class FirstSelenium {

//     private WebDriver driver;
//     private WebDriverWait wait;

//     @Before
//     public void setup() {
//         WebDriverManager.chromedriver().setup();

//         driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         wait = new WebDriverWait(driver, 10);
//     }

//     private final By bodyLocator = By.tagName("body");
//     private final By implementPasswordLocator = By.id("login-with-epic");
//     private final By implementLoginLocator = By.id("sign-in");
//     private final By emailToggler=By.id("email");
//     private final By passwordToggler=By.id("password");
//     private final By BodyCheck = By.tagName("body");


//     @Test
//     public void multiplicationTest() {
//         this.driver.get("https://www.epicgames.com/id/login?lang=en-US&noHostRedirect=true&redirectUrl=https%3A%2F%2Fstore.epicgames.com%2Fen-US%2F&client_id=875a3b57d3a640a6b7f9b4e883463ab4");

//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(bodyLocator));
//         WebElement resultElement = this.driver.findElement(bodyLocator);
//         System.out.println(resultElement.getText());

//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(implementPasswordLocator));
//         WebElement searchTogglerElement = this.driver.findElement(implementPasswordLocator);
//         searchTogglerElement.click();

//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(emailToggler));
//         WebElement emailTogglerElement = this.driver.findElement(emailToggler);
//         emailTogglerElement.sendKeys("bimaxa5128@bunlets.com \n");
        
//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(passwordToggler));
//         WebElement passwordTogglerElement = this.driver.findElement(passwordToggler);
//         passwordTogglerElement.sendKeys("Hungary1234 \n");

//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(implementLoginLocator));
//         WebElement loginTogglerElement = this.driver.findElement(implementLoginLocator);
//         loginTogglerElement.click();

//         this.wait.until(ExpectedConditions.visibilityOfElementLocated(BodyCheck));
//         // WebElement bodyText = this.driver.findElement(BodyCheck);
//         // System.out.println(bodyText.getText());
//         String bodyText = searchResultPage.getBodyText();
//         // Assert.assertTrue(bodyText.contains("found"));
//         Assert.assertTrue(bodyElement.getText().contains("bimaxa5128"));

//     }
//         @After
//     public void close() {
//         if (driver != null) {
//             driver.quit();
//         }
//     }

// }