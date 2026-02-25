package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Resume {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");

        driver.findElement(By.id("login_Layer")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("himanshuraj0110@gmail.com");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("fA2xN4YcU@MzhTe");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        
        driver.get("https://www.naukri.com/mnjuser/profile");
        Thread.sleep(3000);
        
        WebElement uploadButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div/div/div/div[3]/div[1]/div/div[12]/div"));

        
        uploadButton.sendKeys("C:\\\\Users\\\\KIIT\\\\Downloads\\\\resume_hr.pdf");

        System.out.println("Resume Uploaded Successfully!");

        Thread.sleep(5000);

        driver.quit();
        

	}

}
