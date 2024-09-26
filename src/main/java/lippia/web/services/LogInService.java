package lippia.web.services;

import com.crowdar.core.PropertyManager;
import lippia.web.constants.GoogleConstants;
import lippia.web.constants.LogInConstants;

import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.LogInConstants.ENTER_EMAIL;
import static lippia.web.constants.LogInConstants.ENTER_PASSWORD;

public class LogInService {

    //1. Test case: LogIn

    //Precondition
    public static void navegarWebClockify(){navigateTo(PropertyManager.getProperty("https://clockify.me/"));}

    //Click Log In
    public static void clickLogInButton() {click(LogInConstants.LOGIN_BUTTON_NAME);}

    //2. Test case: LogInManually

    //Precondition:
    public static void navegarWebLogIn() {navigateTo(PropertyManager.getProperty("https://app.clockify.me/en/login"));}

    //Log In Manually
    public static void clickManuallyLogIn() {click(LogInConstants.MANUALLY_LOGIN_BUTTON_NAME);}

    //Set email
    public static void SetEMail(String email) {setInput(LogInConstants.ENTER_EMAIL, email);}

    //Set password
    public static void SetPassword(String password) {setInput.ENTER_PASSWORD, password;}

    //Click log in
    public static void clickLogIn() {click(LogInConstants.LOG_IN);}


}
