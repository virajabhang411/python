import java.sql.Date;
import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class App {
    public static void main(String[] args) throws Exception {
        String BaseUrl = "https://sr-convert.shiprocket.in/wigzo/lite/auth/shiprocket/login/";
        String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjMxMzMxMDksInNvdXJjZSI6IiIsImV4cCI6MTY4NDQwNDAzOCwianRpIjoiQnFvbnl6YkFDaEJBakxDayIsImlhdCI6MTY4MzU0MDAzOCwiaXNzIjoiaHR0cHM6Ly9hcGl2Mi5zaGlwcm9ja2V0LmluL3YxL2F1dGgvbG9naW4vdXNlciIsIm5iZiI6MTY4MzU0MDAzOCwiaXNfYWRtaW4iOnRydWUsImFkbWluX3VzZXJfaWQiOjMzMDAxOTl9.PDMD7y9XZC-7FxDyR5cqIBa4k5CmC-8zcT3mJbVe5DA";
       
        
System.setProperty("webdriver.chrome.driver", "C:/Users/abhan/Downloads/chromedriver_win32 (6)/chromedriver113.exe");

WebDriver driver = new ChromeDriver();

driver.get(BaseUrl + jwt);

driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/ul/li[3]/a")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div[2]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/div[4]/section/form/div/div/div/div[1]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/div[4]/section/div/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/div[4]/section/div/div[1]/form/div/div/div/div[1]/div[1]/div/div/div/input")).sendKeys("Automation test Broadcast" +  LocalDate.now());
Thread.sleep(2000);
driver.findElement(By.id("mui-component-select-selectedTemp")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div/div[4]/section/div/button")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div/div/div[4]/section/div/button")).click();

driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[2]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/button")).click();

System.out.println("Broadcast Run Succesfully");


 




}
}

