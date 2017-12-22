package Com.Isobar.Ecom.Cucumber_Flipkart_Demo;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,monochrome=true,features= {"Features/Sample.feature"},
				glue="glue",format= {"pretty","html:reports","json:reports/test.json"},
				tags={"@tag1"})

public class Runner 
{
		
}
