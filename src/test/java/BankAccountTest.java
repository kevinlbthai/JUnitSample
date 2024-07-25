import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@DisplayName("Test BankAccount Class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 300 successfully.")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -500);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance(), "Unexpected value, expected 1000");
    }

    @Test
    @DisplayName("Withdraw more than balance is allowed to be less than 0 in balance")
    public void testWithdrawLessThanZero() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(900);
        assertNotEquals(0, bankAccount.getBalance());

    }

    @Test
    @DisplayName("Test BankAccount is activate after creation.")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.deposit(500);
        assertTrue(bankAccount.isActivate());
    }

    @Test
    @DisplayName("Test HolderName set")
    public void testHolderName() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setHolderName("Kevin");
        assertNotNull(bankAccount.getHolderName());
    }

    @Test
    @DisplayName("Test that we can't withdraw below minimum balance")
    public void testNoWithdrawBelowMinimum() {
        BankAccount bankAccount = new BankAccount(300, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(1300));
    }

    @Test
    @DisplayName("Test withdraw and deposit without exception")
    public void testWithdrawaAndDepositWithoutException() {
        BankAccount bankAccount = new BankAccount(300, 0);
        assertAll( () -> bankAccount.deposit(100), () -> bankAccount.withdraw(200)) ;
    }

    @Test
    @DisplayName("Test deposit timeout")
    public void testDepositTimeout() {
        BankAccount bankAccount = new BankAccount(300, 0);
        assertTimeout(Duration.ofNanos(1), () -> bankAccount.deposit(100));
    }
}
