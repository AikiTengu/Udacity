package MyBatis;

import MyBatis.model.ChatMessage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class ChatPage {


    @FindBy(id = "messageText")
    private WebElement textField;

    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    //@FindBys({@FindBy(className = "chatMessage), @FindBy (name = "username")}
    @FindBy(id = "Username")
    private WebElement firstMessageUsername;

    @FindBy(id = "Message")
    private WebElement firstMessageText;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    public ChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendChatMessage(String text) {
        this.textField.sendKeys(text);
        this.submitButton.click();
    }

    public ChatMessage getFirstMessage() {
        ChatMessage result = new ChatMessage();
       // result.setMessage("Hello Civ!");
       // result.setUsername("Teddy");
        result.setMessage(firstMessageText.getText());

        result.setUsername(firstMessageUsername.getText());
        return result;
    }

    public void pressLogoutButton() {
        this.logoutButton.click();
    }
}