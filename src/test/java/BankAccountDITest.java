import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {

    @RepeatedTest(3)
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(BankAccount bankAccount, RepetitionInfo repetitionInfo) {
        bankAccount.deposit(400);
        assertEquals(400, bankAccount.getBalance());
        System.out.println("Nr: " + repetitionInfo.getCurrentRepetition());
    }
}
