import org.testng.annotations.*;

import java.util.logging.Logger;

public class EspnLogInTest {

    private Logger logger = Logger.getLogger(EspnLogInTest.class.getName());

    @BeforeSuite
    public void existingAccount(){
        logger.info("You have an existing espn account");
    }

    @BeforeClass
    public void openBrowser(){
        logger.info("Open chrome web browser");
    }

    @BeforeMethod
    public void goToHomePage(){
        logger.info("Access the Espn home page at https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
    }

    @Test(groups = {"Espn"})
    @Parameters({"username","password"})
    public void testLogin(String user, String pwd){
        logger.info("Insert username " + user + " and password " + pwd + " and hit enter");
    }

    @AfterMethod
    public void assertLogIn(){
        logger.info("Check that account successfully logged in");
    }

    @AfterClass
    public void closeBrowser(){
        logger.info("Close chrome web browser");
    }
}
