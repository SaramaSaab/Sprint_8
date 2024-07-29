import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getNameAccountCard(){
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"Тим", true},
                {"Тимоти", true},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"Т", false},
                {"Ти", false},
                {"", false},
                {" ", false},
                {"dfdkhgdhgldkfglgsdglsgjsljslkgjsdj", false},
                /* передаем через параметризацию в конструктор AccountTest данные - в частности
                туда улетает переменная name*/
        };
    }

    @Test
    @DisplayName("Check test-class Account")
    public void accountTests(){
        AccountTest accountTest = new AccountTest(name, expected);
        boolean actual = accountTest.actualResult();
        accountTest.expectedResul(actual);
    }

    @Step("ФР выполнения метода checkNameToEmbossMethod")
    public boolean actualResult(){
        Account account = new Account(name);
        return account.checkNameToEmboss();
    }

    @Step("Сравнение ФР и ОР выполнения метода checkNameToEmbossMethod")
    public void expectedResul(boolean actual){
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}
