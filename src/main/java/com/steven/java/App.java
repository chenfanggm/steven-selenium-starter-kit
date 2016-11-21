package com.steven.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class App {
  public static void main( String[] args ) throws Exception {

    System.setProperty("webdriver.gecko.driver", "src/main/java/com/steven/java/driver/geckodriver");
    System.setProperty("webdriver.chrome.driver", "src/main/java/com/steven/java/driver/chromedriver");

    System.out.println( "Starting Selenium..." );

    final WebDriver driver = new SafariDriver();
    driver.manage().window().maximize();
    driver.get("http://www.ocrwebservice.com/account/signup");
    Thread.sleep(500);

    final WebElement userNameInput = driver.findElement(By.id("MainContent_txtUserName"));
    userNameInput.sendKeys("let_me_figureout@gmail.com");
    System.out.println(userNameInput.toString());

    /*(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
      public Boolean apply(final WebDriver d) {
        return d.getTitle().toLowerCase().startsWith("cheese!");
      }
    });

    // Should see: "cheese! - Google Search"
    System.out.println("Page title is: " + driver.getTitle());*/

    //Close the browser
    driver.quit();
  }
}
