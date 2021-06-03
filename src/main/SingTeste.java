// Titulo: Teste de Autenticação de E-mail Gamil
// Autor: Thiago Massa Gomes
// Data: Desenvolvido entre a data 31/05/2021 a 03/06/2021
// Email: thiagomassa6@gmail.com  

package main;


import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SingTeste {
	@Test
	public void testeFazerLoginTaskit() {
		
    	Scanner leitor = new Scanner(System.in);
    	System.out.print("Entre com o email:\n ");
    	String email = leitor.nextLine();
    	System.out.print("Digite a senha: \n");
    	String senha = leitor.nextLine();

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setPosition(new Point(-10000, -10000));
		driver.manage().timeouts().implicitlyWait( 2 , TimeUnit.SECONDS);

		
		driver.get("https://accounts.google.com/signin");
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys(email);
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys(senha);
        driver.findElement(By.id("passwordNext")).click(); 
        
        String logado ="";
        try { 
            logado = driver.findElement(By.className("x7WrMb")).getText(); 
           	assertEquals("Bem-vindo, testeCyan Agroanalytics" , logado);       	
        }
        catch(Exception e) {
        	
        }
                
       	if(logado.equals("Bem-vindo, testeCyan Agroanalytics")) {
       		System.out.print("Sucesso: as credenciais são válidas!!\n");
       	}else {
       		System.out.print("Erro: As credenciais são inválidas!! \n");
       	}
       	
       	driver.quit();
		
	}
	
}