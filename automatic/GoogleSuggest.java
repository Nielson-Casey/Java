package automatic;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSuggest {
	public static void main(String[] args) throws Exception {
        // The Firefox driver supports javascript 
        WebDriver driver = new FirefoxDriver();
        
        System.out.println("es");
        
        // Go to the Google Suggest home page
        driver.get("https://www.facebook.com/?_rdr=p");
        
        WebElement query = driver.findElement(By.id("name"));
    
        System.out.println(query);
        
        //query.sendKeys("casey.nielson23@yahoo.com");
//        
//        // Enter the query string "Cheese"
//        WebElement query = driver.findElement(By.name("q"));
//        query.sendKeys("Cheese");
//
//        // Sleep until the div we want is visible or 5 seconds is over
//        long end = System.currentTimeMillis() + 5000;
//        while (System.currentTimeMillis() < end) {
//            WebElement resultsDiv = driver.findElement(By.className("gssb_e"));
//
//            // If results have been returned, the results are displayed in a drop down.
//            if (resultsDiv.isDisplayed()) {
//              break;
//            }
//        }
//
//        // And now list the suggestions
//        List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));
//        
//        for (WebElement suggestion : allSuggestions) {
//            System.out.println(suggestion.getText());
//        }

        driver.quit();
    }
}
