package uiAutomatorDemo;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class test extends UiAutomatorTestCase {
	public void testDemo() throws UiObjectNotFoundException {
		getUiDevice().pressHome();//点击home
		UiObject settingApp = new UiObject(new UiSelector().text("设置"));//点击设置
		settingApp.click();	
        sleep(2000);
        UiScrollable settingItems = new UiScrollable(new UiSelector().scrollable(true)); 
        UiObject moreSetting = settingItems.getChildByText(new UiSelector().text("更多设置"),"更多设置");  //滑动并选择更多设置           
        moreSetting.click();
        sleep(2000);
        
        UiObject aboutPhone = new UiObject(new UiSelector().text("关于手机"));             
        aboutPhone.click();
        
	}

}
