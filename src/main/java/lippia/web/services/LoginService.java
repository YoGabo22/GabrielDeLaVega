package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LogInConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class LoginService {
    public static void logInManually() {
        WebActionManager.click(LogInConstants.LOG_IN_MANUALLY);
    }
    public static void setEmail(String email){
        WebActionManager.setInput(LogInConstants.EMAIL_INPUT, email);
    }
    public static void setContra(String contra){
        WebActionManager.setInput(LogInConstants.CONTRASENA_INPUT, contra);
    }

    public static void clickLogin() {
        WebActionManager.click(LogInConstants.BUTTON_LOG_IN);
    }

    public static void verifyLogin() {
        waitVisibility(LogInConstants.MESSAGE_XPATH);
        Assert.assertTrue(isVisible(LogInConstants.MESSAGE_XPATH));
    }
}
