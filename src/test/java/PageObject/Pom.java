package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom {
   static WebElement element=null;
    public static WebElement BrowserElement(WebDriver driver){
        element=driver.findElement(By.name("q"));
        return element;
    }
    public static WebElement UserName(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@name='username']"));
        return element;
    }

    public static WebElement Password(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@name='password']"));
        return element;
    }

    public static WebElement LoginButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }
    public static WebElement Dashboardtext(WebDriver driver) {
        element = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module' and text()='Dashboard']"));
        return element;
    }

}
