package barbora.pages;

import org.openqa.selenium.By;

public class RegisterPage {
    private BaseFunc baseFunc;
    private final By REGISTER_FORM = By.id("b-user-register");
    private final By EMAIL = By.name("email");

    public RegisterPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void fillInEmail(String email) {
        baseFunc.getElement(REGISTER_FORM).findElement(EMAIL).sendKeys(email);
    }
}