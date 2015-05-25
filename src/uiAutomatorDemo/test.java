package uiAutomatorDemo;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Test extends UiAutomatorTestCase {
	public static void main(String[] args) {
		String androidId = "1";
		String jarName = "uiAutomatorDemo";
		String testClass = "uiAutomatorDemo.test";
		String testName = "testDemo";
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
	}

	public void testDemo() throws UiObjectNotFoundException {
		System.out.print("Starting test.");
		UiDevice.getInstance().pressHome();
		sleep(1000);
		UiDevice.getInstance().pressBack();
		sleep(1000);
		
		
//		getUiDevice().pressHome();// 点击home
//		UiObject settingApp = new UiObject(new UiSelector().text("设置"));// 点击设置
//		settingApp.click();
//		sleep(2000);
		UiScrollable settingItems = new UiScrollable(new UiSelector().scrollable(true));
//		UiObject moreSetting = settingItems.getChildByText(
//				new UiSelector().text("更多设置"), "更多设置"); // 滑动并选择更多设置
//		moreSetting.click();
//		sleep(2000);
//		UiObject aboutPhone = new UiObject(new UiSelector().text("关于手机"));
//		aboutPhone.click();

//		getUiDevice().pressHome();// 点击home
		settingItems.setAsHorizontalList().scrollToEnd(2);
		//settingItems.scrollForward(5);
		UiObject txt = settingItems.getChildByText(new UiSelector()
				.className(android.widget.TextView.class.getName()), "平安天下通");
		txt.click();

	}

}
