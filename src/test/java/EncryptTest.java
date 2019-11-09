import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypting_instantiatesCorrectly() {
        Encrypt testEncrypting = new Encrypt("Keith", 1);
        assertEquals(true, testEncrypting instanceof Encrypt);
    }
    @Test
    public void takesInputText()
    {
        Encrypt testEncrypting = new Encrypt("Keith", 1);
        assertEquals("Keith", testEncrypting.getUserInputText());
    }
    @Test
    public void takesKey()
    {
        Encrypt testEncrypting = new Encrypt("Keith", 1);
        assertEquals(1, testEncrypting.getUserKey());
    }


}