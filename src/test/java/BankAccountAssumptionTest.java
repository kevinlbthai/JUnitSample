import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountAssumptionTest {

    @Test
    @DisplayName("Test BankAccount is activate after creation.")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTrue(bankAccount != null, "Bank account is not null");
        assertFalse(bankAccount == null, "Bank account is not null");
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActivate()) );
        assertTrue(bankAccount.isActivate());
    }
}
