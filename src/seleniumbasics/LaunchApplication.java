package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/maximrealtypros/IdeaProjects/LearningSeleniumBasics/Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

    }
}
