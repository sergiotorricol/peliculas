package testTodoLy;

import org.junit.Assert;
import org.junit.Test;
import pageTodoLy.LoginPage;
import pageTodoLy.MainPage;
import pageTodoLy.MenuPage;

public class TestPassword extends TestBase {
    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private MenuPage menuPage = new MenuPage();

    @Test
    public void testPassword() {
        String oldPassword = "veronica";
        String newPassword = "veronica2";
        mainPage.loginImage.click();
        loginPage.loginTodoLy("satorricol@gmail.com", oldPassword);
        menuPage.settingsButton.click();
        menuPage.oldPasswordTextBox.type(oldPassword);
        menuPage.newPasswordTextBox.type(newPassword);
        menuPage.okButton.click();
        menuPage.logoutLink.click();
        mainPage.loginImage.click();
        loginPage.loginTodoLy("satorricol@gmail.com", newPassword);
        boolean actualResult = menuPage.logoutLink.isDisplayed();
        Assert.assertTrue("ERROR", actualResult);
    }
}