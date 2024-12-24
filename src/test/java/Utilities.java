import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utilities {
    public static void scroll(WebDriver driver, int height){
        JavascriptExecutor js = (JavascriptExecutor) driver; //cascading the driver
        js.executeScript("window.scrollBy(0,"+height+")"); //height value will be through input
    }
}
