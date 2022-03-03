package Cadastro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TesteGoogle {

	@Test
	public void teste() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 800));

		//acessar ambiente
		driver.get("https://outlook.live.com/owa/");
		driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a")).click();

		// Entrar
		driver.findElement(By.id("signup")).click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		Email
		driver.findElement(By.id("MemberName")).sendKeys("emailTeste2022");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		// Botão
		driver.findElement(By.id("iSignupAction")).click();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		// Senha
		driver.findElement(By.id("PasswordInput")).sendKeys("Lucaslg125###");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div/div[1]/div[3]/div/div[1]/div[5]/div/div/form/div[7]/div/div/div[2]/input"))
				.click();

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#FirstName")).sendKeys("Sayuri");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#LastName")).sendKeys("S Kubota");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		driver.findElement(By.id("iSignupAction")).click();

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		WebElement comboDia = driver.findElement(By.cssSelector("#BirthDay"));
		Select select = new Select(comboDia);
		select.selectByVisibleText("20");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		// Combo mês
		WebElement comboMes = driver.findElement(By.cssSelector("#BirthMonth"));
		select = new Select(comboMes);
		select.selectByVisibleText("julho");

		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("#BirthYear")).sendKeys("2021");

		driver.findElement(By.id("iSignupAction")).click();

		// Combo Ano
		 WebElement comboAno = driver.findElement(By.cssSelector("#BirthYear"));
		select = new Select(comboAno);
		select.selectByVisibleText("1990");

	}
}
