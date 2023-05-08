import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class App {
    public static void main(String[] args) throws Exception {
 
System.setProperty("webdriver.chrome.driver", "C:/Users/abhan/Downloads/chromedriver_win32 (6)/chromedriver113.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://app.shiprocket.in");

driver.manage().window().maximize();

driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[2]/div[1]/form/div[1]/div[1]/input")).sendKeys("viraj+02@wigzo.com");

//driver.wait(2000);
driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[2]/div[1]/form/div[1]/div[2]/input")).sendKeys("Viraj@123");

driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[2]/div[1]/form/div[3]/div/button")).click();

//driver.findElement(By.className("/html/body/app-root/app-layout/div[1]/app-navbar/sr-sidebar/app-header/mat-toolbar/button[3]/span[1]")).click();


//driver.wait(2000);

driver.close();
 System.out.println("login");



}
}
