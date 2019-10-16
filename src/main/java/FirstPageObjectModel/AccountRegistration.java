package FirstPageObjectModel;

import org.openqa.selenium.By;

public class AccountRegistration extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _firstName = By.xpath("//input[@data-val-required='First name is required.']");
    private By _lastName = By.xpath("//input[@data-val-required='Last name is required.']");
    private By _email = By.xpath("//input[@data-val-required='Email is required.']");
    private By _password = By.xpath("//input[@id='Password']");
    private By _confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _clickOnRegister = By.id("register-button");

    public void userEnterRegistrationDetail()
    {
        sendText(_firstName,loadProps.getProperty("firstName"));
        sendText(_lastName, loadProps.getProperty("lastName"));
        sendText(_email,randomDate()+loadProps.getProperty("email"));
        sendText(_password,"leicester");
        sendText(_confirmPassword,"leicester");
        clickOnElement(_clickOnRegister);
    }
}
