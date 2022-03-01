package objectOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// set browser path
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\resours\\drivers\\chromedriver.exe");

		// create browser instance
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open test app
		driver.navigate().to("http://www.facebook.com");

		// driver.get("http://www.facebook.com");

		// identify the object and operation
		WebElement loginEmail = driver.findElement(By.id("email"));
		// enter data
		loginEmail.sendKeys("nareshtester");

		WebElement loginPwd = driver.findElement(By.name("pass"));
		loginPwd.sendKeys("managerdev");

		WebElement createAcc = driver.findElement(By.linkText("Create New Account"));

		createAcc.click();
		// Thread.sleep(2000);

		WebElement fname = driver.findElement(By.name("firstname"));

		fname.sendKeys("kollu naresh");

		WebElement lname = driver.findElement(By.name("lastname"));

		lname.sendKeys("kollu");

		WebElement myemail = driver.findElement(By.name("reg_email__"));

		myemail.sendKeys("0000000000");

		WebElement npasswd = driver.findElement(By.name("reg_passwd__"));

		npasswd.sendKeys("naresh@123");

		WebElement dob = driver.findElement(By.id("day"));

		// dob.sendKeys("01");
		// webelement convert to select category
		Select daySelect = new Select(dob);
		daySelect.selectByValue("23");

		WebElement dom = driver.findElement(By.id("month"));

		// dom.sendKeys("May");
		// Webelement convert to select category
		Select monthSelect = new Select(dom);
		monthSelect.selectByVisibleText("Jun");

		WebElement doy = driver.findElement(By.id("year"));

		// doy.sendKeys("2022");
		Select yearSelect = new Select(doy);
		yearSelect.selectByValue("2020");

		WebElement genderfemale = driver.findElement(By.xpath("//input[@value='1']"));
		genderfemale.click();
		Thread.sleep(2000);

		WebElement gendermale = driver.findElement(By.xpath("//input[@value='2']"));
		gendermale.click();
		Thread.sleep(2000);

		WebElement gendercustom = driver.findElement(By.xpath("//input[@value='-1']"));
		gendercustom.click();
		Thread.sleep(2000);

		WebElement selectyourpronoun = driver.findElement(By.name("preferred_pronoun"));

		// convert to select catagory
		Select syp = new Select(selectyourpronoun);
		syp.selectByVisibleText("He: \"Wish him a happy birthday!\"");
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.name("custom_gender"));
		gender.sendKeys("naresh");

		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();

	}

}
