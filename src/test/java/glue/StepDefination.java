package glue;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resuable.resuableFunctions;


public class StepDefination {

	public static WebDriver driver;
	//protected static Scenario s;
	resuableFunctions r1;
	//Scenario 1
	//@Before("@tag1")// individual tag
	//@Before({"@tag1,@tag2"}) all tags combines
	//@Before({"@tag1","@tag2"}) either of the tag
	
	public void before(Scenario scenario) {
		System.out.println("This is before hook");
		driver=new ChromeDriver();
		r1=new resuableFunctions(driver,scenario);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@After
	public void after() {
		System.out.println("This is After hook");
		//driver.quit(); 
		}
	
	@Given("^I am able to access the (.*)$")
	public void i_am_able_to_access_the_http_www_flipkart_com(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
		WebElement close= driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		r1.takescreenshot();
	}

	@When("^I search for a (.*)$")
	public void i_search_for_a_Apple_Phone(String Product)  {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search_product= driver.findElement(By.xpath("//input[@name='q']"));
		search_product.sendKeys(Product);
		r1.takescreenshot();
		
		//search_product.sendKeys(Keys.ENTER);

	}

	@When("^I choose the first Autofill option$")
	public void i_choose_the_first_Autofill_option() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul._1PBbw8")).findElement(By.cssSelector("li._1va75j")).click();
		//driver.findElement(By.cssSelector("ul._1PBbw8")).findElement(By.cssSelector("li._1va75j")).sendKeys(Keys.ESCAPE);
		WebElement search_bar= driver.findElement(By.xpath("//input[@name='q']"));
		search_bar.click();
		search_bar.sendKeys(Keys.ESCAPE);
		r1.takescreenshot();
	}

	@When("^I add the first product to Cart$")
	public void i_add_the_first_product_to_Cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.className("_3wU53n")).click();
		
		System.out.println(driver.getWindowHandles());
		Set<String> windows=driver.getWindowHandles();
		Object[] wins=windows.toArray();
		System.out.println("No of Windows  =  "+windows.size());
		driver.switchTo().window(wins[1].toString());
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[contain(text(),'Buy')]")).click();
		driver.findElement(By.xpath("//button[@data-reactid='116' or @data-reactid='111' or @data-reactid='113']")).click();
		r1.takescreenshot();
	}

	@Then("^I should be able to checkout the cart$")
	public void i_should_be_able_to_checkout_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*Thread.sleep(2000);
		
		//List<WebElement> CartPage=driver.findElements(By.className("_1WMqsr"));
		//List<WebElement> LoginPage=driver.findElements(By.className("_2zrpKA _14H79F"));
		
		System.out.println(driver.findElement(By.className("_1WMqsr")).getText());
		if(driver.findElement(By.className("_1WMqsr")).getText().contains("CART"))
		{
			System.out.println("in If condition");
			driver.findElement(By.xpath("//span[.='Place Order']")).click();
			driver.findElement(By.className("_2zrpKA _14H79F")).sendKeys("sunay@gmail.com");
			driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
		}
		else if(driver.findElement(By.className("_1_m52b")).getText().contains("LOGIN"))
		{
			System.out.println("in Else if Condition:");
			driver.findElement(By.className("_2zrpKA _14H79F")).sendKeys("sunay@gmail.com");
			driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
		}*/
		
	}
	
}
