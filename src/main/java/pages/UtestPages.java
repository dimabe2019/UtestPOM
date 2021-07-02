package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UtestPages {

    private static By btnRegistro = By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']");
    private static By txtNombre = By.xpath("//input[@id='firstName']");
    private static By txtApellido = By.xpath("//input[@id='lastName']");
    private static By txtEmail = By.xpath("//input[@id='email']");
    private static By FechaMes = By.xpath("//select[@id='birthMonth']");
    private static By FechaDia = By.xpath("//select[@name='birthDay']");
    private static By FechaAnio = By.xpath("//select[@id='birthYear']");
    private static By campoIdioma = By.xpath("//input[@type='search']");
    private static By selecIdioma = By.xpath("//div[contains(text(),'Spanish')]");
    private static By boton1 = By.xpath("//a[@aria-label='Next step - define your location']");
    private static By mensaje = By.xpath("//span[contains(text(),'Add your address')]");
    private static By txtCiudad = By.id("city");
    private static By txtPais = By.xpath("//span[contains(text(),'Select a country')]");
    private static By boton2 = By.xpath("//a[@aria-label='Next step - select your devices']");
    private static By MarcaCel = By.xpath("//span[contains(text(),'Select Brand')]");
    private static By inputMarcaCel = By.xpath("//input[@placeholder='Select Brand']");
    private static By versionCel = By.xpath("//span[@aria-label='Select a Model']");
    private static By inputVersionCel = By.xpath("//input[@placeholder='Select a Model']");
    private static By SoCel = By.xpath("//span[@class='ui-select-placeholder text-muted']");
    private static By inputSoCel = By.xpath("//div[contains(text(),'Android 10')]");
    private static By boton3 = By.xpath("//a[@aria-label='Next - final step']");
    private static By password = By.id("password");
    private static By confirmPassword = By.id("confirmPassword");
    private static By terminos = By.id("termOfUse");
    private static By politicas = By.id("privacySetting");
    private static By boton4 = By.id("laddaBtn");
    private static By mensajaExitoso = By.xpath("//h1");


    public static By getBtnRegistro() {
        return btnRegistro;
    }

    public static By getTxtNombre() {
        return txtNombre;
    }

    public static By getTxtApellido() {
        return txtApellido;
    }

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getFechaMes() {
        return FechaMes;
    }

    public static By getFechaDia() {
        return FechaDia;
    }

    public static By getFechaAnio() {
        return FechaAnio;
    }

    public static By getCampoIdioma() {
        return campoIdioma;
    }

    public static By getSelecIdioma() {
        return selecIdioma;
    }

    public static By getBoton1() {
        return boton1;
    }

    public static By getMensaje() {
        return mensaje;
    }

    public static By getTxtCiudad() {
        return txtCiudad;
    }

    public static By getTxtPais() {
        return txtPais;
    }

    public static By getBoton2() {
        return boton2;
    }

    public static By getMarcaCel() {
        return MarcaCel;
    }

    public static By getInputMarcaCel() {
        return inputMarcaCel;
    }

    public static By getVersionCel() {
        return versionCel;
    }

    public static By getInputVersionCel() {
        return inputVersionCel;
    }

    public static By getSoCel() {
        return SoCel;
    }

    public static By getInputSoCel() {
        return inputSoCel;
    }

    public static By getBoton3() {
        return boton3;
    }

    public static By getPassword() {
        return password;
    }

    public static By getConfirmPassword() {
        return confirmPassword;
    }

    public static By getTerminos() {
        return terminos;
    }

    public static By getPoliticas() {
        return politicas;
    }

    public static By getBoton4() {
        return boton4;
    }

    public static By getMensajaExitoso() {
        return mensajaExitoso;
    }
}
