import Utility.BaseDriver;
import Utility.My.MyFunc;
import com.google.j2objc.annotations.Weak;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class SerkanSengul extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement Register = driver.findElement(By.cssSelector("[href='/register']"));
        Register.click();

        WebElement radiobutton = driver.findElement(By.id("gender-male"));
        radiobutton.click();

        WebElement FirstNaem = driver.findElement(By.id("FirstName"));
        FirstNaem.sendKeys("serkan");

        WebElement LastName = driver.findElement(By.id("LastName"));
        LastName.sendKeys("sengul");

        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("aserar111231@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("kobe21tmac");

        WebElement repassword = driver.findElement(By.id("ConfirmPassword"));
        repassword.sendKeys("kobe21tmac");

        WebElement registerbutton = driver.findElement(By.id("register-button"));
        registerbutton.click();

        driver.navigate().back();
        driver.navigate().back();
        MyFunc.wait(1);

        WebElement addProduct = driver.findElement(By.cssSelector("[alt='Picture of 14.1-inch Laptop']"));
        addProduct.click();
        MyFunc.wait(1);

        WebElement AddToCart = driver.findElement(By.id("add-to-cart-button-31"));
        AddToCart.click();

        WebElement ShoppingList = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        ShoppingList.click();
        MyFunc.wait(1);

        WebElement agreebutton = driver.findElement(By.cssSelector("[id='termsofservice']"));
        agreebutton.click();
        MyFunc.wait(1);

        WebElement Checkout = driver.findElement(By.id("checkout"));
        Checkout.click();
        MyFunc.wait(1);


        WebElement Company = driver.findElement(By.id("BillingNewAddress_Company"));
        Company.sendKeys("KardeslerKundura");
        MyFunc.wait(1);

        WebElement SelectCountry = driver.findElement(By.id("BillingNewAddress_CountryId"));
        actions.moveToElement(SelectCountry).click().perform();

        Select select = new Select(SelectCountry);
        select.selectByValue("2");

        MyFunc.wait(1);

        WebElement SelectState = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
        actions.moveToElement(SelectState).click().perform();

        Select select1 = new Select(SelectState);
        select1.selectByValue("63");

        MyFunc.wait(1);
        WebElement City = driver.findElement(By.id("BillingNewAddress_City"));
        City.sendKeys("İzmir");

        MyFunc.wait(1);
        WebElement Adress = driver.findElement(By.id("BillingNewAddress_Address1"));
        Adress.sendKeys("Cigli");
        MyFunc.wait(1);

        WebElement Adress1 = driver.findElement(By.cssSelector("[class='text-box single-line valid']"));
        Adress1.sendKeys("hamdi");
        MyFunc.wait(1);

        WebElement ZipPostalCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        ZipPostalCode.sendKeys("35000");
        MyFunc.wait(1);

        WebElement PhoneNumber = driver.findElement(By.id("name=BillingNewAddress.PhoneNumber"));
        PhoneNumber.sendKeys("5555202020");
        MyFunc.wait(1);

        WebElement FaxNumber = driver.findElement(By.id("BillingNewAddress_FaxNumber"));
        FaxNumber.sendKeys("564214841");
        MyFunc.wait(1);

        WebElement Continue = driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        Continue.click();
        MyFunc.wait(1);

        WebElement InStorePickUp = driver.findElement(By.id("PickUpInStore"));
        InStorePickUp.click();
        MyFunc.wait(1);

        WebElement VisibleText = driver.findElement(By.xpath("(//div[@style='display: none;'])[1]"));
        MyFunc.wait(1);

        Assert.assertTrue(VisibleText.isDisplayed());


    }
}
