package test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.UtestSteps;

public class Utest {

    @Steps
    UtestSteps utestSteps = new UtestSteps();

    @Before
    public void setUp() {
        SeleniumWebDriver.ChromeWebDriver("https://www.utest.com/");
    }

    @Test
    public void CompletarFormulario() throws InterruptedException {
        Thread.sleep(2000);
        utestSteps.procesoRegistro();
    }

    @After
    public void tearDown() {
        utestSteps.validarRegistro();
        //SeleniumWebDriver.driver.quit();

    }
}
