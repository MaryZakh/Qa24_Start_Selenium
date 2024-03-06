import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }


    @Test
    public void cssLocators() {

        //by tag name
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_2 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));


        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a_1 = wd.findElement(By.cssSelector("a"));
        List<WebElement>list = wd.findElements(By.tagName("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input1 = wd.findElement(By.cssSelector("input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));

        //by class
        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));
        WebElement el17 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el5 = wd.findElement(By.cssSelector(".login_login__3EHKB"));


        //by id
        WebElement el6 = wd.findElement(By.id("root"));
        WebElement el7 = wd.findElement(By.cssSelector("#root"));
        WebElement el19 = wd.findElement(By.xpath("//div[@id='root']"));

        //by attribute
        WebElement el8 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement el20 = wd.findElement(By.xpath("//*[@id='root']"));

        WebElement el9 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el10 = wd.findElement(By.cssSelector("[href='/about']"));

        WebElement el11 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el12 = wd.findElement(By.name("email"));

        //one of elements find by attribute ==> start & end & contains value
        WebElement el13 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el21 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement el14 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el22 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        //end
        WebElement el15 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement el23 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        //contains
        WebElement el16 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el24 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));



        //by text
        WebElement el25 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
    }

}
