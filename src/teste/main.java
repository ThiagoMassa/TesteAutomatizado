package teste;

import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class main 
{
    public static void main(String[] args) throws Exception 
    {
    	Scanner leitor = new Scanner(System.in);
    	System.out.print("Entre com o email:\n ");
    	String email = leitor.nextLine();
    	System.out.print("Digite a senha: \n");
    	String senha = leitor.nextLine();
    	
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options); 
        driver.get("https://accounts.google.com/signin");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys(email);
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys(senha);
        driver.findElement(By.id("passwordNext")).click();
        
        System.out.print(driver.));
    }
}