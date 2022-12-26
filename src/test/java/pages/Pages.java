package pages;

import pages.EventModulePage;
import pages.LoginModulePage;

public class Pages {
    private EventModulePage eventModulePage;
    private LoginModulePage loginModulePage;
    private DashBoardModulePage dashBoardModulePage;

    public EventModulePage eventModulePage(){
        if (eventModulePage==null){
            eventModulePage= new EventModulePage();
        }
        return eventModulePage;
    }

    public LoginModulePage loginModulePage(){
        if (loginModulePage==null){
            loginModulePage= new LoginModulePage();
        }
        return loginModulePage;
    }

    public DashBoardModulePage dashBoardModulePage(){
        if (dashBoardModulePage==null){
            dashBoardModulePage= new DashBoardModulePage();
        }
        return dashBoardModulePage;
    }

}
