package LOSJ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest {

    private static final Logger log =									//Logger → Used to print logs
            LoggerFactory.getLogger(LoginTest.class);					//LoggerFactory → Creates logger object

    public void login() {
        log.info("Login test started");
        log.warn("Login warning");
        log.error("Login failed due to invalid credentials");
    }
}