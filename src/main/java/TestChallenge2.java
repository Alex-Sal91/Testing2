import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestChallenge2 {


    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/Bex/Desktop/chrome-driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://testingchallenges.thetestingmap.org/challenge2.php");



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementByClassName('number').getAttribute('type').setAttribute('text')");;

    }

}

