import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {
    @Test
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);

    }
//    "Sophie"-> "S0ph13"@Test
    public void testHashPassword(){
        assertEquals("S0ph13", CodeupCrypt.hashPassword("Sophie"));
    }


}
