package com.myseleniumpro03;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myseleniumpro02.utilities.TestBase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11ExtentReports extends TestBase {
    ExtentReports extentReports;
    ExtentTest    extentTest;
    ExtentHtmlReporter extentHtmlReporter;

    @Test
    public void extendReportTest() {
        //Report Path
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path =System.getProperty("user.dir")+"/test-output/report/"+currentDate+"test_report.html";
        //Create HTML reportet us,ng the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
        //Create extent report
        extentReports = new ExtentReports();
        //Add custom information
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","TechproEd");
        extentReports.setSystemInfo("SQA","john");

        extentHtmlReporter.config().setDocumentTitle("TechProEd BluCar");
        extentHtmlReporter.config().setDocumentTitle("TechProEd Extent Report");

        //Attach  HTML & extent reports
        extentReports.attachReporter(extentHtmlReporter);
        //Report is completed. Now we just create test using extentTest object
        extentTest = extentReports.createTest("my Project Extent Report","This is for smoke test report");

        //logging the test steps int the report
        extentTest.info("User goes to google home page");
        extentTest.pass("User goes to google home page");
        extentTest.fail("User goes to google home page");
        extentTest.skip("User goes to google home page");
        extentTest.warning("User goes to google home page");
        driver.get("https://www.google.com");

        extentTest.info("User search for Cybertruck release date");
        driver.findElement(By.name("q")).sendKeys("tesla Cybertruck release date"+ Keys.ENTER);

        //Generating and Ending the report
        extentReports.flush();

    }
}
