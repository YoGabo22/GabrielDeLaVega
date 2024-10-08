package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.LogOutConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class LogOutService {
    public static void verPerfil() {
        WebActionManager.click(LogOutConstants.PERFIL_OPTION);
    }

    public static void closeSession() {
        WebActionManager.click(LogOutConstants.CLOSE_SESSION);
    }

    public static void verifyLogOut() {
        waitVisibility(LogOutConstants.VERIFY_LOGOUT);
        Assert.assertTrue(isVisible(LogOutConstants.VERIFY_LOGOUT));
    }
}
