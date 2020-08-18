package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class FileUpload implements Interaction {
    WebDriver driver = getProxiedDriver();;
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement input = driver.findElement(By.id("uploadFile"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display = 'block';", input);
        //driver.findElement(By.id("uploadFile")).sendKeys("Users/luis.villa/Desktop/PlantillageneraltechnologyQuesos.xlsx");
        input.sendKeys("/Users/luis.villa/Downloads/Plantilla_general_technology_Smartphones_FAIL.xls ");
        //WebDriverWait wait = new WebDriverWait(driver, 1);
        //wait.until(ExpectedConditions.visibilityOf(input));
        //input.click();
        //driver.switchTo().alert().sendKeys(" /Users/luis.villa/Downloads/Plantilla\\ general\\ technology\\ Quesos.xlsx \n");
        //String vent = String.valueOf(driver.getWindowHandles());
        //System.out.println(vent);
        //driver.switchTo().window(vent);

        //input.click();
        //driver.findElement(By.id("load-file-button")).click();
        //driver.findElement(By.id("load-file-button")).sendKeys("/Users/luis.villa/Desktop/testseller.xlsx");


    }

    public static Interaction upload(){
        return instrumented(FileUpload.class);
    }
}
