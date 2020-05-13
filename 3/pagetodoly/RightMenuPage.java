package pageTodoLy;

import controlSelenium.Button;
import controlSelenium.Icon;
import controlSelenium.Label;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class RightMenuPage {
    public TextBox addItemTextBox;
    public Button addItemButton;
    public Label itemLabel;
    public Icon optionsIcon;
    public Button deleteButton;
    public Label deletedItemLabel;

    public RightMenuPage() {
        addItemTextBox = new TextBox(By.id("NewItemContentInput"));
        addItemButton = new Button(By.id("NewItemAddButton"));
        optionsIcon = new Icon(By.xpath("//td[@class='ItemIndicator']/div[@class='ItemIndicator']/img[@class='ItemMenu']"));
        deleteButton = new Button(By.xpath("//li[@class='delete separator']/a[text()='Delete']"));
        deletedItemLabel = new Label(By.id("InfoMessageText"));
    }

    public void selectProject(String itemText) {
        itemLabel = new Label(By.xpath("//div[text()='" + itemText + "' and @class='ItemContentDiv']"));
        itemLabel.click();
    }
}

