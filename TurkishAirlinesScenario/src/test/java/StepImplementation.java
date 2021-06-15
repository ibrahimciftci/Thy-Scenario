
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;



public class StepImplementation extends BaseTest{
    @Step("Bilet al butonuna tıkla")
    public void clickTicketButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/acMain_btnBooking");
        el1.click();
    }

    @Step("Tek yön uçuşu şeçilir")
    public void clickOneWayButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el2 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
        el2.click();
    }

    @Step("Sabiha Gökçen Airport")
    public void saw() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys("saw");
        MobileElement el3 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();
    }

    @Step("Esenboğa Airport")
    public void esb() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_tvToCode");
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
        el2.sendKeys("esb");
        MobileElement el3 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
        el3.click();
    }

    @Step("Tarih bilgisi 2 gün sonra")
    public void selectDate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/dateWidget_tvDateDay");
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[4]/android.widget.TextView");
        el2.click();
        MobileElement el3 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el3.click();
    }

    @Step("Yetişkin bilgisi 2 seçildi")
    public void passengerInformation() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        el1.click();
    }

    @Step("Uçuş ara butonuna tıkla")
    public void clickBookAFlightButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnSearch");
        el1.click();
    }

    @Step("Biletleri fiyata göre sırala")
    public void editFilters() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_tvSortAndFilter");
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        el2.click();
    }

    @Step("En ucuz bilet seçilir")
    public void ticket() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.View");
        el1.click();
        MobileElement el2 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]");
        el2.click();
        MobileElement el3 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");
        el3.click();
    }

    @Step("Devam butonuna tıkla")
    public void clickDevamButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementById("com.turkishairlines.mobile:id/frPickPassenger_btnContinue");
        el1.click();
    }

}
