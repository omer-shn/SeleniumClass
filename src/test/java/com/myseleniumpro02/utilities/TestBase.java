package com.myseleniumpro02.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase<extentHtmlReporter, extentReports, extentTest> {

    protected static WebDriver driver;
    ExtentReports extentReports;
    ExtentTest extentTest;
    ExtentHtmlReporter extentHtmlReporter;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //The Code about Extend Reports
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/report/" + currentDate + "test_report.html";
        //Create HTML reportet us,ng the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
        //Create extent report
        extentReports = new ExtentReports();
        //Add custom information
        extentReports.setSystemInfo("Environment", "Test Environment");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Application", "TechproEd");
        extentReports.setSystemInfo("SQA", "john");

        extentHtmlReporter.config().setDocumentTitle("TechProEd BluCar");
        extentHtmlReporter.config().setDocumentTitle("TechProEd Extent Report");

        //Attach  HTML & extent reports
        extentReports.attachReporter(extentHtmlReporter);
        //Report is completed. Now we just create test using extentTest object
        extentTest = extentReports.createTest("my Project Extent Report", "This is for smoke test report");

    }

    @After
    public void tearDown() {
        driver.quit();
        extentReports.flush();
    }

    //Checkbox
    public static void selectCheckBox(WebElement checkboxElement, boolean checked){
        if(checked){
            if (!checkboxElement.isSelected()){
                checkboxElement.click();
            }
        }else{
            if (checkboxElement.isSelected()){
                checkboxElement.click();
            }
        }
    }
    //Window Handle
    public static void switchToTargetWindow(String targetTitle) {
        for (String handle : driver.getWindowHandles()) {
            String title = driver.switchTo().window(handle).getTitle();
            if (title.equals(targetTitle)) {
                System.out.println("Page found : "+driver.getTitle());
                return;
            }
        }
    }

    //ScreenShot
    public void takeScreenShot() throws IOException {
//        1. Taking screenshot using getScreenshotAs
        File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        /*
        Alternatively
        TakesScreenshot ts=(TakesScreenshot)driver;
        File image = ts.getScreenshotAs(OutputType.FILE);
         */
//        2. We will save the image in this path. using currentDate for getting different name every time
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        System.out.println(currentDate);
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentDate+"test-image.png";
        File finalPath = new File(path);
        FileUtils.copyFile(image,finalPath);
    }


}
