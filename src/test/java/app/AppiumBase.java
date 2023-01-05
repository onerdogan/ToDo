package app;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



    public class AppiumBase {

        public static AndroidDriver androidDriver() throws InterruptedException, MalformedURLException {


            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\IdeaProjects\\toDo\\src\\test\\java\\app\\Faladdin\\faladdin-3-2-16-prod.apk");
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            Thread.sleep(4000);
            return driver;
        }
    }

