package app.Faladdin;


import app.AppiumBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Faladdin extends AppiumBase {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = androidDriver();
        driver.findElementById("com.faladdin.app:id/getStartedButton").click();
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"DrinkForMeText\"]").click();

     // driver.findElementById("com.faladdin.app:id/btnContinue").click();
     // driver.findElementById("com.faladdin.app:id/tvGoogle").click();
     // driver.findElementById("com.faladdin.app:id/md_button_positive").click();
     // Thread.sleep(10000);
     // driver.findElementByClassName("android.widget.EditText").click();
     // driver.findElementByClassName("android.widget.EditText").sendKeys("qa.nurullahdk@gmail.com");
     // driver.findElementByXPath("//*[contains(@text,'Next')]").click();
     // Thread.sleep(3000);
     // driver.findElementByClassName("android.widget.EditText").sendKeys("Emir2011");
     // driver.findElementByXPath("//*[contains(@text,'Next')]").click();
         Thread.sleep(3000);
        driver.findElementById("com.faladdin.app:id/btnContinue").click();

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]").click();
        driver.findElementByXPath("//*[contains(@text,'Hesabı Seç')]").click();
        Thread.sleep(2000);
        driver.findElementById("com.faladdin.app:id/md_button_positive").click();
        Thread.sleep(3000);
        driver.findElementById("com.faladdin.app:id/btnContinue").click();
    }

}
