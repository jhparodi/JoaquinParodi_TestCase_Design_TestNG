import org.testng.annotations.*;

import java.util.logging.Logger;

public class EspnLogOutTest {

    private Logger logger = Logger.getLogger(EspnLogOutTest.class.getName());

    @BeforeSuite
    public void existingAccount(){
        logger.info("You have an existing espn account");
    }

    @BeforeClass
    public void openBrowser(){
        logger.info("Open chrome web browser");
    }

    @BeforeMethod
    @Parameters({"username","password"})
    public void logIn(String user, String pwd){
        logger.info("Access the Espn home page at https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
        logger.info("Log in to the account using username: " + user + " and password: " + pwd);
        logger.info("Check account logged in successfully");
    }

    @Test (groups = {"Espn"})
    public void testLogOut(){
        logger.info("Click account and select Log out");
    }

    @AfterMethod
    public void assertLogOut(){
        logger.info("Check that account successfully logged out");
    }

    @AfterClass
    public void closeBrowser(){
        logger.info("Close chrome web browser");
    }
}
