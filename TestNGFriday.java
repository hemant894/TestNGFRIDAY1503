import org.openqa.selenium.WebDriver;

import javafx.beans.property.SetProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class TestNGFriday {
    WebDriver driver;


    @Test(priority = 1)
    void openbrowser() {
        System.out.println("open Browser");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
    }

    @Test(priority = 2)
    void selecttheproduct() {
        System.out.println("Select the product");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.manage().window().minimize();




    }
    @Test(priority = 3)
    void Addproductinbasket(){
        System.out.println("Add product in bakset");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/computers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();


    }


    @Test(priority = 4)
    void updatebasket() {
        System.out.println("update basket");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }

    @Test(priority = 5)
    void updatebasket1() {
        System.out.println("update qty in basket");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();


    }


    @Test(priority = 6)
    void checkout(){
        System.out.println("go to checkout");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();


    }
    @Test(priority = 7)
    void checkoutasguest(){
        System.out.println("check out as guest");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();

    }

    @Test(priority = 8)
    void billingaddress(){
        System.out.println("Add billing address");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("abckedll");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("xyesd");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("abckekd@hgotmaklel.com");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("helloworld");
        WebElement country = driver.findElement(By.name("country"));
        country.sendKeys("United Kingdom");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("ahslbiels");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("jgleomfkf");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("oitriroo");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("LEOeo0");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9878098673");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("0909098767");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
    }
    @Test(priority = 9)
    void payment(){
        System.out.println("Add billing address");
        System.setProperty("webdriver.driver.edge", "C:\\software\\Driver\\msedgedriver.exe\\");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("abckedll");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("xyesd");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("abckekd@hgotmaklel.com");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("EBAY");
        driver.findElement(By.id("valid")).sendKeys("Aruba");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("ahslbiels");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("jgleomfkf");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("oitriroo");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("LEOeo0");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9878098673");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("0909098767");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        WebElement selectcreditcard = driver.findElement(By.name("Visa"));
        selectcreditcard.sendKeys("Visa");


}
    }



