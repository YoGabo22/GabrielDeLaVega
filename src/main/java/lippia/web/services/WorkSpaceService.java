package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkSpaceConstants;

import static com.crowdar.core.actions.ActionManager.getText;


public class WorkSpaceService
{
    public static void setName(String Wname) {
        WebActionManager.setInput(WorkSpaceConstants.WORKSPACE_NAME, Wname);
    }

    public static void create() {
        WebActionManager.click(WorkSpaceConstants.CREATE);
    }

    public static void verifyWorkSpaceName(String name) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // TODO
        WebActionManager.waitVisibility(WorkSpaceConstants.WORKSPACE_NAME_LIST);
        Assert.assertEquals(name, getText(WorkSpaceConstants.WORKSPACE_NAME_LIST), "El workspace no se creo");
    }
}
