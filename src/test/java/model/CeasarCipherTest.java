package model;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CeasarCipherTest {
    @Test
    public void encrypt_returnsIntegerForShiftValue() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        int shift = 9;
        assertEquals(shift, newCeasarCipher.getShift());
    }


    @Test
    public void ceaserCipher_allowsUppercaseInput_string() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String expectedOutput = new String();
        expectedOutput = "ATTACKATDAWN";
        assertEquals(expectedOutput, newCeasarCipher.encryption("ATTACKATDAWN", 9));
    }

    @Test
    public void ceaserCipher_doesEncryption_string() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String output = new String();
        String result = " ";
        assertEquals(output, newCeasarCipher.encryption("pull", 4));

    }

    @Test
    public void ceaserCipher_doesDecryption_string() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String output = new String();
        output = "hello";
        assertEquals(output, newCeasarCipher.decryption("doll", 4));
    }

    @Test
    public void decryption_takesInUppercaseLetters_string() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String output = "hello";
        assertEquals(output, newCeasarCipher.decryption("BC", 20));
    }
}

