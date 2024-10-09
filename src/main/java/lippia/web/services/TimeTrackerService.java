package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrackerConstants;

public class TimeTrackerService {

    public static void createProject() {
        WebActionManager.click(TimeTrackerConstants.CREATE_PROJECT);
    }

    public static void createNewProject() {
        WebActionManager.click(TimeTrackerConstants.CREATE_NEW_PROJECT);
    }

    public static void setName(String name) {
        WebActionManager.setInput(TimeTrackerConstants.NAME_INPUT, name);
    }

    public static void create() {
        WebActionManager.click(TimeTrackerConstants.CREATE);
    }

//    public static void projects() {
//        WebActionManager.click(TimeTrackerConstants.PROJECTS);
//    }

    public static void workspace() {
        WebActionManager.click(TimeTrackerConstants.WORKSPACE);
    }

    public static void manageWorkSpace() {
        WebActionManager.click(TimeTrackerConstants.MANAGE_WORKSPACE);
    }

    public static void createNewWorkSpace() {
        WebActionManager.click(TimeTrackerConstants.CREATE_NEW_WORKSPACE);
    }
}
