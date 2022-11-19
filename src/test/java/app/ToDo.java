package app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ToDo extends AppiumBase {
    @Test
    public void test2DONE() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementById("com.example.yeshasprabhakar.todo:id/fab").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").sendKeys("Test");
        driver.findElementById("android:id/button1").click();//DONE button
        String toastMessage = driver.findElementByXPath("/hierarchy/android.widget.Toast").getText();
        System.out.println(toastMessage);
        Thread.sleep(2000);
        String newTask = "Test";
        String actualTask = driver.findElementById("com.example.yeshasprabhakar.todo:id/title").getText();
        Assert.assertEquals(newTask, actualTask);
        driver.quit();
    }

    @Test
    public void test1CANCEL() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/fab").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").sendKeys("Test");
        driver.findElementById("android:id/button2").click();//CANCEL BUTTON
        Thread.sleep(2000);

        String expectedText = "What do you want to do today?";
        String actualText = driver.findElementByXPath("//*[contains(@text,'What do you want to do today?')]").getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains(expectedText));
        driver.quit();
    }
        @Test
        public void test3OOPS () throws MalformedURLException, InterruptedException {
            AndroidDriver driver = androidDriver();

            driver.findElementById("com.example.yeshasprabhakar.todo:id/fab").click();
            driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").click();
            driver.findElementById("android:id/button1").click();//DONE button
            String toastMessage = driver.findElementByXPath("/hierarchy/android.widget.Toast").getText();
            System.out.println(toastMessage);

            String expectedText="Oops, Cannot set an empty ToDo!!!";
            Thread.sleep(1000);
            Assert.assertTrue(expectedText.contains(toastMessage));
            Thread.sleep(2000);
            driver.findElementById("com.example.yeshasprabhakar.todo:id/delete").click();
            driver.quit();

    }
    @Test
    public void test4DELETE() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementById("com.example.yeshasprabhakar.todo:id/fab").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").click();
        driver.findElementById("com.example.yeshasprabhakar.todo:id/edit_title").sendKeys("Test");
        driver.findElementById("android:id/button1").click();//DONE button
        Thread.sleep(2000);
        String newTask = "Test";
        String actualTask = driver.findElementById("com.example.yeshasprabhakar.todo:id/title").getText();
        Assert.assertEquals(newTask, actualTask);
        driver.findElementById("com.example.yeshasprabhakar.todo:id/delete").click();
        String toastMessage = driver.findElementByXPath("/hierarchy/android.widget.Toast").getText();
        System.out.println(toastMessage);
        String expectedText="Deleted Successfully!";
        Thread.sleep(1000);
        Assert.assertTrue(expectedText.contains(toastMessage));
        driver.quit();
    }
    @Test
    public void test5BACKGROUND() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();

        driver.findElementById("com.example.yeshasprabhakar.todo:id/themeActionButton").click();
        Thread.sleep(2000);
        driver.findElementById("com.example.yeshasprabhakar.todo:id/themeActionButton").click();
        Thread.sleep(2000);
        driver.quit();
    }
}