package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.UpdateConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class UpdateService {

    //Click on SETTINGS
    public static void clickOnSettings(){
        WebActionManager.click(UpdateConstants.SETTINGS_BUTTON);
    }

    //Set new workspace name
    public static void updateNewWorkspaceName(String name){
        WebActionManager.setInput(UpdateConstants.INPUT_WORKSPACE_NAME, name);
    }

    //Click on PROJECTS
    public static void clickOnProjects(){
        WebActionManager.click(UpdateConstants.PROJECT_CLICK);
    }

    //Update verification
    public static void updateNotification(){
        waitVisibility(UpdateConstants.UPDATE_NOTIFICATION);
        Assert.assertTrue(isVisible(UpdateConstants.UPDATE_NOTIFICATION));
    }

}
