package click.capodanno;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
/**
 * simple test in JUNIT 5
 * @author francesco capodanno
 */
public class simpleClassTest {
    
    @Test
    void justAnExample() {
        String test = simpleClass.TO_TEST;
        assertTrue(test.equals("ok"));
    }
    
}
