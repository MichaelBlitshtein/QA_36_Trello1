package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestBase;

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
       app.getUser().initLogin();
       app.getUser().pause(2000);
       app.getUser().fillInLoginForm("michael.blitshtein@gmail.com","Tommy743!!");
       app.getUser().submitLogin();
       app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());

    }



}
//refactor -> Extract Method //  Ctrl + Alt + M
//refactor -> Introduce Parametr  //  Ctrl + Alt + P

