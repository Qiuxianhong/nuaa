package Android;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Runner extends UiAutomatorTestCase{
	  public void testDemo() throws UiObjectNotFoundException {
          getUiDevice().pressHome();
          // �������ò˵�
          UiObject settingApp = new UiObject(new UiSelector().text("Settings"));
          settingApp.click();
          //����3��
          try {
              Thread.sleep(3000);
          } catch (InterruptedException e1) {
              // TODO Auto-generated catch block
              e1.printStackTrace();
          }
          // �������Ժ����뷨����
          UiScrollable settingItems = new UiScrollable( new UiSelector().scrollable(true));

          UiObject languageAndInputItem = settingItems.getChildByText(
                  new UiSelector().text("Language & input"), "Language & input", true);
          languageAndInputItem.clickAndWaitForNewWindow();
          
      }
}
