package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String captureScreenshot(WebDriver driver, String testName) {

		String timeStamp = LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

		String screenshotDir = System.getProperty("user.dir") + "/screenshots";

		File dir = new File(screenshotDir);
		if (!dir.exists()) {
			dir.mkdir();
		}

		String filePath = screenshotDir + "/" + testName + "_" + timeStamp + ".png";

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return filePath;
	}
}