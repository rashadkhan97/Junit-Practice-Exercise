import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyJunit {
    WebDriver driver; //webDriver set globally

    @BeforeAll
    public void setup() { //setup method for driver setup
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        driver = new ChromeDriver(ops);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    @DisplayName("Check is title showing properly")
    public void getTitle() {
        driver.get("https://demoqa.com/");
        String titleActual = driver.getTitle();
        String titleExpected = "DEMOQA";
        assert titleActual != null;
        System.out.println(titleActual);
        Assertions.assertTrue(titleActual.contains(titleExpected));
    }

    //locator using
    @Test
    public void submitForm() {
        driver.get("https://demoqa.com/text-box");

        // for scrolling purpose
        Utilities.scroll(driver, 500);

        //using id
        //driver.findElement(By.id("userName")).sendKeys("Rashadul Islam");

        //using css selector
//        WebElement firstNameElem= driver.findElement(By.cssSelector("[type=text]"));
//        firstNameElem.sendKeys("Test user");

        //using tagName
//        List<WebElement> textBox= driver.findElements(By.tagName("input"));
//        textBox.get(0).sendKeys("User 1");
//        textBox.get(1).sendKeys("test@test.com");

        //using classname
        List<WebElement> textBox = driver.findElements(By.className("form-control"));
        textBox.get(0).sendKeys("Rashadul");
        textBox.get(1).sendKeys("rasu99@gmail.com");
        textBox.get(2).sendKeys("Ashulia");
        textBox.get(3).sendKeys("Islampur");

        //submit button click
        driver.findElement(By.className("btn-primary")).click();

        //result show and actual expected checking fof text box
        List<WebElement> resultElement = driver.findElements(By.tagName("p"));
        String actualResult_R0 = resultElement.get(0).getText();
        String actualResult_R1 = resultElement.get(1).getText();
        String actualResult_R2 = resultElement.get(2).getText();
        String actualResult_R3 = resultElement.get(3).getText();

        String expectedResult_R0 = "Rashadul";
        String expectedResult_R1 = "rasu99@gmail.com";
        String expectedResult_R2 = "Ashulia";
        String expectedResult_R3 = "Islampur";

        Assertions.assertTrue(actualResult_R0.contains(expectedResult_R0));
        Assertions.assertTrue(actualResult_R1.contains(expectedResult_R1));
        Assertions.assertTrue(actualResult_R2.contains(expectedResult_R2));
        Assertions.assertTrue(actualResult_R3.contains(expectedResult_R3));

    }

    @Test
    public void clickButton() {
        driver.get("https://demoqa.com/buttons");
        List<WebElement> btnElement = driver.findElements(By.className("btn-primary"));

        Actions actions = new Actions(driver); //need actions for button operation perform
        actions.doubleClick(btnElement.get(0)).perform(); //doubleclick method for double click button
        actions.contextClick(btnElement.get(1)).perform(); //contextclick method for rightclick button
        actions.click(btnElement.get(2)).perform(); // click method for click button

        //result show and actual expected checking for buttons
        List<WebElement> checkBtnElement = driver.findElements(By.tagName("p"));

        String actualResult_01 = checkBtnElement.get(0).getText();
        String actualResult_02 = checkBtnElement.get(1).getText();
        String actualResult_03 = checkBtnElement.get(2).getText();

        String expectedResult_01 = "You have done a double click";
        String expectedResult_02 = "You have done a right click";
        String expectedResult_03 = "You have done a dynamic click";

        Assertions.assertTrue(actualResult_01.contains(expectedResult_01));
        Assertions.assertTrue(actualResult_02.contains(expectedResult_02));
        Assertions.assertTrue(actualResult_03.contains(expectedResult_03));
    }

    @Test
    public void handleAlerts() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        List<WebElement> alertsElement = driver.findElements(By.className("btn-primary"));

        //Button 01 - Click Button to see alert
        alertsElement.get(0).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Button 02 - On button click, alert will appear after 5 seconds
        alertsElement.get(1).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //Button 03 - On button click, confirm box will appear .
        alertsElement.get(2).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept(); //defines click ok
        // driver.switchTo().alert().dismiss(); //defines click no/cancel
    }

    @Test
    public void selectDate() {
        driver.get("https://demoqa.com/date-picker");
        WebElement txtCalenderElement = driver.findElement(By.id("datePickerMonthYearInput"));
        txtCalenderElement.click();
        txtCalenderElement.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
        txtCalenderElement.sendKeys("10/05/2024", Keys.ENTER);
    }

    @Test
    public void selectDropdown() {
        driver.get("https://demoqa.com/select-menu");
        Select options = new Select(driver.findElement(By.id("oldSelectMenu")));
        options.selectByVisibleText("Green");
        options.selectByValue("1");

    }

    @Test
    public void selectDynamicDropdown() {
        driver.get("https://demoqa.com/select-menu");
        List<WebElement> dropElement = driver.findElements(By.className("css-1hwfws3"));
        dropElement.get(1).click(); //since i need to click 2nd element
        Actions actions = new Actions(driver);//jehetu amk akhn scroll korte hobe tai actions class anbo akhn

        //jehetu ami drop down menu r 2nd value ta nibo tai 2 bar arrow down perform korsi.
        //ami joto no value nibo toto bar amk arrow down korte hobe
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform(); //last e ese enter diye perform korte hobe

    }

    @Test
    public void mouseHover() {
        driver.get("https://www.bubt.edu.bd/");
        List<WebElement> mouseHoverElement = driver.findElements(By.xpath("//a[contains(text(), \"About\")]"));
        Actions actions = new Actions(driver); //jehetu dropdown option arrise hobe
        actions.moveToElement(mouseHoverElement.get(2)).perform(); //hover method --> moveToElement
    }

    @Test
    public void multiTabHandle() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();// normally findElement using id
        Thread.sleep(3000);

        //new tab soho current tab arraylist akare show hoi using getWindowHandles().
        // Tai arraylist e store kore rakha hoise value ta
        ArrayList<String> arrayList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(arrayList.get(1)); //using switchTo method and index 1 new tab e switch kora hoise

        String txt = driver.findElement(By.id("sampleHeading")).getText(); //new tab er find element kora hoilo
        System.out.println(txt);
        driver.close();  //new tab close
        driver.switchTo().window(arrayList.get(0)); //returning to previous tab once new tab close


    }

    @Test
    public void multipleWindowHandle() {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle = driver.getWindowHandle(); //main window theke new window ta alada kore fellam

        //jehetu akhn windows onk gula tai sob gula k track rakhte --> getWindowHandles()
        //ar amra akta list pabo and jehetu eita array list na karaon kono tab er moddhe open hocche na
        // tai normally set er moddhe rakhtesi
        Set<String> allWindowHandles = driver.getWindowHandles(); //getWindowHandles -> last e s means all windows.

//jehetu set use kora hoise tai count korte chaile amader akta iterator method lagbe --> allWindowHandles.interator()
        Iterator<String> iterator = allWindowHandles.iterator(); //all window count korar jnno ready kora hoilo
        while (iterator.hasNext()) {
            String childWindow = iterator.next();  //jotokhn porjnto amr childWindow count kora ses na hobe count cholbe
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow); //main window theke child window alada kore fellam
                String txt = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println(txt);
            }
        }
        driver.close(); //child windows gula close
        driver.switchTo().window(mainWindowHandle); //main window te switch kora holo
    }

    @Test
    public void uploadImage() {
        driver.get("https://demoqa.com/upload-download");
        System.out.println(System.getProperty("user.dir") + "/src/test/resources/testFile.png");
        driver.findElement(By.id("uploadFile")).
                sendKeys(System.getProperty("user.dir") + "/src/test/resources/testFile.png");

    }

    @Test
    public void scrapWebTablesData() {
        driver.get("https://demoqa.com/webtables");
        WebElement table = driver.findElement(By.className("rt-tbody")); //first e table ta k find korlam

        //jehetu akhn amra table er value gula k find korbo tai --> table.findElements().
        // Ar allrows jehetu List dicche tai --> List<WebElement>
        List<WebElement> allRows = table.findElements(By.cssSelector("[role=rowgroup]"));
        for (WebElement row : allRows) {
            //frist e foreach loop e check korbo allrows then cell --> 247 no line er moto same kaj korbe
            List<WebElement> allCells = table.findElements(By.cssSelector("[role = gridcell]"));
            for (WebElement cell : allCells) {
                System.out.println(cell.getText()); // cell er value ta getText() korbo
            }
        }
    }

    @Test
    public void handleIframe() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1"); //first amra frame e switch kortesi
        String text = driver.findElement(By.id("sampleHeading")).getText(); //then frame ta k findElements diye find
        //Assertions.assertTrue(text.contains("This is a sample page"));  // then assert kortesi
        driver.switchTo().defaultContent(); // lastly sob ses hoile then default windows e return korbo

    }



    @AfterAll
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        //2 vabe kora jai - driver.close(), driver.quit(), close means tab close, Quit means full browser close
    }

}

