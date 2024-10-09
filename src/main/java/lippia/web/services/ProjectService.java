package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.ProjectConstants;

import static com.crowdar.core.actions.ActionManager.getText;
import static com.crowdar.core.actions.ActionManager.isVisible;

//import static com.crowdar.core.actions.ActionManager.getText;

public class ProjectService {
    public static void verifyProjectName(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // TODO
        WebActionManager.waitVisibility(ProjectConstants.MENU_PROJECT);
        WebActionManager.click(ProjectConstants.MENU_PROJECT);
        WebActionManager.setInput(ProjectConstants.INPUT_FIND_PROJECT, name);
        WebActionManager.click(ProjectConstants.APLLY_FILTER);
        //Assert.assertTrue(isVisible(ProjectConstants.PROJECT_NAME_LIST));
        Assert.assertEquals(name, getText(ProjectConstants.PROJECT_NAME_LIST), "El projecto no se creo");
    }
}
