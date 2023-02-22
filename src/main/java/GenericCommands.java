import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericCommands {

    public static WebDriver driver;

public void login(String username, String password){
    try{
        WebElement userName = driver.findElement(By.id("loginID"));
        userName.clear();
        userName.sendKeys(username);

        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.clear();
        passWord.sendKeys(password);

        WebElement signIn = driver.findElement(By.id("signInButton"));
        signIn.click();
        driver.manage().window().maximize();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}

public void logout(){
    try {
        WebElement logout = driver.findElement(By.id("logoutButton"));
        logout.click();
    }
    catch (Exception e){
        e.printStackTrace();
    }
}


}
