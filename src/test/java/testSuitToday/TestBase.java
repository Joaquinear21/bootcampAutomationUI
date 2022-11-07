package testSuitToday;


import org.junit.jupiter.api.*;
import pages.todoLy.*;
import session.Session;

public class TestBase {
    MainPage mainPage= new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuSection menuSection = new MenuSection();
    ProjectSection projectSection= new ProjectSection();

    // todo property file
    String user="bootcamp@mojix45.com";
    String password ="12345";


    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}
