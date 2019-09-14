package appiumtest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * created by FAMILY 13.09.2019
 */

public class AppiumTest {

    public static void main(String[] args) throws IOException {



        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.223.103:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");


        cap.setCapability("appPackage","com.example.android.contactmanager");
        cap.setCapability("appActivity","com.example.android.contactmanager.ContactManager");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\test\\screenshot1.png"));
    }

}
