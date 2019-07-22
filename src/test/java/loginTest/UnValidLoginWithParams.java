package loginTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class UnValidLoginWithParams extends ParentTest {
    String login, passord;

    public UnValidLoginWithParams(String login, String passord) {
        this.login = login;
        this.passord = passord;
    }

    @Parameterized.Parameters(name = "Parameters are {0} and (1)")
    public static Collection testData(){
        return Arrays.asList(new Object[][] {
                {"Unicod.mk@gmail.com", "ghy678"},
                {"Unicod.mk@gmail","mx5vug"}
        });

    }

    @Test
    public void unvalidLogin(){
        loginPage.loginWithCred(login, passord);
        {

            checkExpectedResult("Avatar should not by present"
                    , false
                    , homePage.isAvatarPresent());
        }
    }
}
