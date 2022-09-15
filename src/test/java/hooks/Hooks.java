package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webdriverpool.Initializer;

public class Hooks {

    @Before
    public void initialize() {
        Initializer.initialize();
    }

    @After
    public void quitBrowser(Scenario scenario) { Initializer.quit(); }

}
