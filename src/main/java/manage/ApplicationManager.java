package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ApplicationManager {
    WebDriver wd;

    HelperUser user;
    BoardHelper board;


    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://trello.com/");

        user=new HelperUser(wd);
        board = new BoardHelper(wd);
    }

    public void quit(){
        //wd.close();
       // wd.quit();
    }

    public HelperUser getUser() {
        return user;
    }

    public BoardHelper getBoard() {
        return board;
    }
}
