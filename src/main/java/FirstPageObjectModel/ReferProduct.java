package FirstPageObjectModel;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferProduct extends Utils{
    LoadProps loadProps = new LoadProps();

    ReferProductResultPage referProductResultPage = new ReferProductResultPage();
    private By _clickOnEmail = By.xpath("//input[@value='Email a friend']");
    private By _typeEmailAddress = By.id("FriendEmail");
    private By _personalMessageInEmail = By.name("PersonalMessage");
    private By _clickOnSend = By.name("send-email");

    public void referProductToFriend()
    {
        clickOnElement(_clickOnEmail);
        referProductResultPage.verifyUserIsOnEmailAFriendPage();
        sendText(_typeEmailAddress,"testtest123456@test.com");
        sendText(_personalMessageInEmail,"nice product have loook");
        clickOnElement(_clickOnSend);
    }}
