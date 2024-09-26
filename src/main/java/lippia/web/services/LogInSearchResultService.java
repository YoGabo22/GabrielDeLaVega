package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogInSearchResultService {

    private static WebElement stats() {
        return getElement(GoogleConstants.STATS_ID);
    }

    private static WebElement getElement(String statsId) {
        return null;
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }


}
