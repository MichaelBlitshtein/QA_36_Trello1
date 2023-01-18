package tests;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login1 extends TestBase {

@BeforeMethod
public void preConditions(){
    if(app.getUser().isLogged()){
        app.getUser().logOut();
    }
}

    @Test
    public void login1(){
        User user = new User().withEmail("michael.blitshtein@gmail.com").withPassword("Tommy743!!");
       app.getUser().initLogin();
       app.getUser().pause(2000);
       app.getUser().fillInLoginForm(user);
       app.getUser().submitLogin();
       app.getUser().pause(10000);

        Assert.assertTrue(app.getUser().isLogged());

    }

    @Test
    public void login2(){

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillInLoginForm("michael.blitshtein@gmail.com", "Tommy743!!");
        app.getUser().submitLogin();
        app.getUser().pause(10000);

        Assert.assertTrue(app.getUser().isLogged());

    }



}
//refactor -> Extract Method //  Ctrl + Alt + M
//refactor -> Introduce Parametr  //  Ctrl + Alt + P


