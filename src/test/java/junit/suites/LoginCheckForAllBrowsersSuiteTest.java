package junit.suites;
 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import webdriver.testscenarios.loginCheck.LoginCheckChromeTest;
import webdriver.testscenarios.loginCheck.LoginCheckFirefoxTest;
import webdriver.testscenarios.loginCheck.LoginCheckIETest;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginCheckIETest.class,
        LoginCheckFirefoxTest.class,
        LoginCheckChromeTest.class
})
public class LoginCheckForAllBrowsersSuiteTest {
}