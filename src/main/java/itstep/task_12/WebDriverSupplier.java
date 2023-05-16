package itstep.task_12;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSupplier {
    public static WebDriver driver;

   // public static void setupDriver() {
       // ChromeDriverManager.getInstance().setup();
      //  ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--remote-allow-origins=*");
      //  driver = new ChromeDriver(options);
    //}
   //public static WebDriver setupDriver() {
       // WebDriver initialization code here
     //  return driver;
   //}

   // public static void closeDriver() {
    //    driver.close();
    //    driver.quit();
    //}

    public static WebDriver setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MARSHAL\\Desktop\\JAVA2\\itstep\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
