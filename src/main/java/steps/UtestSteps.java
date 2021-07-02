package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.UtestPages;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UtestSteps {

    //Función para realizar clic
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    //Funcion para realizar la escritura en un campo
    public void escribirTextoEnElemento(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public void enter(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(Keys.ENTER);
    }

    public void seleccion(By elemento, String texto) {
        WebElement selectElement = SeleniumWebDriver.driver.findElement(elemento);
        Select selectObjeto = new Select(selectElement);
        selectObjeto.selectByVisibleText(texto);
    }

    //funcion para realizar un scroll
    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,550)");
    }

    //Funcion que realiza una espera
    public void Esperar(int seconds) {

        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }

    //Función para obtener el texto de un elemento
    public String obtenerTextoDeElemento(By elemento) {
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validarTextoEnPantalla(By elemento, String texto) {
        assertEquals(obtenerTextoDeElemento(elemento),texto);
    }

    public void procesoRegistro() {

        Esperar(10);
        clicEnElemento(UtestPages.getBtnRegistro());
        escribirTextoEnElemento(UtestPages.getTxtNombre(),"Ana");
        escribirTextoEnElemento(UtestPages.getTxtApellido(),"Rosales");
        escribirTextoEnElemento(UtestPages.getTxtEmail(),"anitarosales21@gmail.com");
        seleccion(UtestPages.getFechaMes(),"February");
        seleccion(UtestPages.getFechaDia(),"23");
        seleccion(UtestPages.getFechaAnio(),"1989");
        scroll();
        clicEnElemento(UtestPages.getCampoIdioma());
        clicEnElemento(UtestPages.getSelecIdioma());
        clicEnElemento(UtestPages.getBoton1());
        if (UtestPages.getMensaje().equals("true")) {
            clicEnElemento(UtestPages.getTxtCiudad());
        }
        Esperar(50);
        clicEnElemento(UtestPages.getTxtPais());
        Esperar(10);
        clicEnElemento(UtestPages.getBoton2());
        clicEnElemento(UtestPages.getMarcaCel());
        escribirTextoEnElemento(UtestPages.getInputMarcaCel(),"Motorola");
        enter(UtestPages.getInputMarcaCel());
        Esperar(20);
        clicEnElemento(UtestPages.getVersionCel());
        escribirTextoEnElemento(UtestPages.getInputVersionCel(),"Moto G9 Plus");
        enter(UtestPages.getInputVersionCel());
        Esperar(20);
        clicEnElemento(UtestPages.getSoCel());
        clicEnElemento(UtestPages.getInputSoCel());
        clicEnElemento(UtestPages.getBoton3());
        escribirTextoEnElemento(UtestPages.getPassword(),"AnaRosales2021");
        escribirTextoEnElemento(UtestPages.getConfirmPassword(),"AnaRosales2021");
        clicEnElemento(UtestPages.getTerminos());
        clicEnElemento(UtestPages.getPoliticas());
        clicEnElemento(UtestPages.getBoton4());

    }

    public void validarRegistro() {
        validarTextoEnPantalla(UtestPages.getMensajaExitoso(),"Welcome to the world's largest community of freelance software testers!");
    }

}
