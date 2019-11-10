import static org.junit.Assert.*;
import org.junit.Test;

public class DecryptTest {
    @Test
    public void getUserInput_string(){
        Decrypt testEncrypting = new Decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 1);
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertTrue(expectedOutput==testEncrypting.getUserInputText());
    }
    @Test
    public void getUserKey_Integer(){
        Decrypt testEncrypting = new Decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 1);
        int expectedOutput = 1;
        assertTrue(expectedOutput==testEncrypting.getUserKey());
    }
    @Test
    public void decryptuserInputString_string(){
        Decrypt testEncrypting = new Decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 1);
        String expectedOuput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOuput,testEncrypting.getDecription());
    }


}