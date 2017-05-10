package android.test;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Teste {

	static File diretorioAplicacao = new File("/Users/inmetrics");
	static File arquivoAplicacao = new File(diretorioAplicacao, "TrianguloApp.apk");
	
	public static void main(String[] args) throws Exception{
		initializeDrivers("Android Emulator", "", "TrianguloApp");
	}
	
	public static void initializeDrivers(String device, String appPackage, String appActivity) throws Exception{
			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); //Name of mobile web browser to automate. Should be an empty string if automating an app instead.
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
//			capabilities.setCapability("androidPackage", appPackage);
//			capabilities.setCapability("appActivity", appActivity);	
			capabilities.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());
//			capabilities.setCapability("chromedriverExecutable", "Desktop/chromedriver");
//			capabilities.setCapability("noReset", true);
//			capabilities.setCapability("newCommandTimeout", 3000);
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
// /wd/hub http://0.0.0.0:4723"
			
	}
}
