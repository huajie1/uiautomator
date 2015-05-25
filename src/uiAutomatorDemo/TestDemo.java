package uiAutomatorDemo;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestDemo extends UiAutomatorTestCase {
	
	public void testDemo() throws UiObjectNotFoundException{
		System.out.println("Start test");
		UiDevice.getInstance().pressHome();
		sleep(1000);
		System.out.println("Search app");
		
		//UiScrollable roll = new UiScrollable(new UiSelector().resourceId("com.bbk.launcher2:id/workspace"));
		UiScrollable search = new UiScrollable(new UiSelector().scrollable(true));
		search.setAsHorizontalList();
		UiObject todayNews = search.getChildByText(new UiSelector().text("今日头条"), "今日头条", true);
		//UiObject todayNews = new UiObject(new UiSelector().text("今日头条"));
		//roll.setAsHorizontalList();
		//roll.scrollIntoView(todayNews);
		todayNews.clickAndWaitForNewWindow();
		sleep(5000);
		System.out.println("Click button");
		UiObject sz = new UiObject(new UiSelector().resourceId("com.ss.android.article.news:id/category_text").text("深圳"));
		sz.clickAndWaitForNewWindow();
		sleep(5000);
		System.out.println("Search news");
		UiScrollable list = new UiScrollable(new UiSelector().resourceId("android:id/list"));
		UiObject news = new UiObject(new UiSelector().text("茶文化讲座开进信息学院"));
		list.scrollIntoView(news);
		news.clickAndWaitForNewWindow();
		sleep(5000);
		UiObject comment = new UiObject(new UiSelector().text("写评论"));
		comment.exists();
		System.out.println("Test end");

		
	}

}
