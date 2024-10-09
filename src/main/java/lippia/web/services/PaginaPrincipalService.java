package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.PaginaPrincipalConstants;

import static com.crowdar.core.actions.ActionManager.getText;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PaginaPrincipalService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickOnLogin() {
        WebActionManager.click(PaginaPrincipalConstants.BUTTON_LOG_IN);
    }

    public static void verifyError(String error) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // TODO
        WebActionManager.waitVisibility(PaginaPrincipalConstants.ERROR_MESSAGE);
        Assert.assertEquals(error, getText(PaginaPrincipalConstants.ERROR_MESSAGE));
    }
}
