package testTodoLy;

import org.junit.Assert;
import org.junit.Test;
import pageTodoLy.LoginPage;
import pageTodoLy.MainPage;
import pageTodoLy.MenuPage;
import pageTodoLy.RightMenuPage;

public class TestDeleteItem extends TestBase {

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private MenuPage menuPage = new MenuPage();
    private RightMenuPage rightMenuPage = new RightMenuPage();


    @Test
    public void testDeleteItem() throws InterruptedException {
        String itemName = "BEEE";
        mainPage.loginImage.click();
        loginPage.loginTodoLy("satorricol@gmail.com", "veronica2");
        rightMenuPage.addItemTextBox.type(itemName);
        rightMenuPage.addItemButton.click();
        rightMenuPage.selectProject(itemName);
        rightMenuPage.optionsIcon.click();
        rightMenuPage.deleteButton.click();
        this.waitTime(3);
        boolean actualResult = rightMenuPage.deletedItemLabel.isDisplayed();
        Assert.assertTrue("ERROR", actualResult);
    }
}

