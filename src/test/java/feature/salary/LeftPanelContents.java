package stepdefinition.Dashboard;
import arp.CucumberArpReport;
import arp.ReportService;
import com.unitedsofthouse.ucucumberpackage.typesfactory.types.Element;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import pages.base.PageInstance;
import pages.relime.DashboardPage;
import pages.relime.SettingsPage;
import java.util.List;
/**
 * Created by kozlov on 10/6/2016.
 */
public class LeftPanelContents extends PageInstance {
    @Autowired
    DashboardPage dashboardPage;
    @And("^I can see that \"([^\"]*)\" left column icon has tooltip \"([^\"]*)\"")
    public void iCanSeeThatActionsColumnHasIcons(String icon, String tooltip) throws Throwable{
        if (!checkIfFurtherStepsAreNeeded()) {
            return;
        }
        try {
            int element = -1;
            switch (icon){
                case "Activity":
                    element = 0;
                    break;
                case "Editor":
                    element = 1;
                    break;
                case "Settings":
                    element = 2;
                    break;
                case "Feature Management":
                    element = 3;
                    break;
                default:
                    ReportService.reportAction("Wrong variable. Correct icon names: Activity, Editor, Settings, Feature Management", false);
            }
            ReportService.reportAction("Icon " + icon + " has tooltip '" + tooltip + "'.", dashboardPage.sidePanelElements.get(element).getAttribute("data-uib-tooltip").equals(tooltip));
        } catch (AssertionError e) {
            throw e;
        } catch (Throwable e)   {
            ReportService.reportAction("Error: " + e.getMessage(), false);
        } finally {
            CucumberArpReport.nextStep();
        }
    }
}
