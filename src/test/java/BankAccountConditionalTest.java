import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {

    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac() {

    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testWindows() {

    }

    @Test
    @EnabledOnJre({JRE.OTHER})
    public void testJDK22() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_18})
    public void testNoJDK22() {

    }

}
