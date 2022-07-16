import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTest {


    private final String checkedName;
    private final boolean expected;

    public AccountTest(String checkedName, boolean expected) {
        this.checkedName = checkedName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object [][] getTestData() {
        return new Object [][] {
                {"Correct Nameeeeeeee", true},
                {"C N", true},
                {"IncorrectName", false},
                {" Incorrectname", false},
                {"Incorrectname ", false},
                {"Incorrect  Name", false},
                {"Ie", false},
                {"Incorrect Nameeeeeee", false},
                {"", false},
                {null, false},
        };
    }

    @Test
    @DisplayName("Check return value for different names")
    @Description("Basic Test to check different requirement for name")
    public void  methodReturnsTrueForCorrectName() throws Exception {
        Account account = new Account(checkedName);
        Assert.assertEquals(expected, account.checkNameToEmboss());
    }
}
