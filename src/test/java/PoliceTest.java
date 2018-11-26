import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    public void should_check_driver(){
        assertTrue(new Police().checkDriver(new Driver(18)));
        assertFalse(new Police().checkDriver(new Driver(17)));
    }
}
