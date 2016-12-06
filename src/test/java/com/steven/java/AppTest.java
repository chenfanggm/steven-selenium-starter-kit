package com.steven.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


/**
 * Selenium Test with TestNG
 */
public class AppTest {

  private WebDriver driver;

  @BeforeTest
  public void beforeTest() {
    System.setProperty("webdriver.gecko.driver", "src/test/java/com/steven/java/driver/geckodriver");
    System.setProperty("webdriver.chrome.driver", "src/test/java/com/steven/java/driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
        driver.quit();
    }

  @Test
  public void helloTest() {
    driver.get("https://chenfang.me");
    final String title = driver.getTitle();
    Assert.assertTrue(title.contains("Chen Fang"));
  }
}
