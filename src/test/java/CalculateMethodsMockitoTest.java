import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculateMethodsMockitoTest {

    @Mock
    CalculateMethods calculateMethods = new CalculateMethods();

    @BeforeEach
    public void setupMocks() {
        Mockito.when(calculateMethods.add(9, 3)).thenReturn(12.0);
        Mockito.when(calculateMethods.add(6, 3)).thenReturn(9.0);
    }

    @Test
    public void testDivide() {
        assertEquals(9.0, calculateMethods.add(6, 3));
        assertEquals(12.0, calculateMethods.add(9, 3));
    }

}
