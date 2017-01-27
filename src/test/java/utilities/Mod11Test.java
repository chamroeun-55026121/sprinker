package utilities;

import org.junit.Test;

/**
 * @author Peerapat Asoktummarungsri
 */
public class Mod11Test {

    @Test
    public void testCalc() {
        final String source = "525668100075663";
        final int hash = Mod11.calc(source);
        
        System.out.println(hash);
    }
    
}
