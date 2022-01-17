package model;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CeasarCipherTest {
    @Test
    public void encryption_returnsIntegerForShiftValue() {
        CeasarCipher ceasarCipher = new CeasarCipher();
        int shift = 9;
        assertEquals(shift, ceasarCipher.getShift());

    }

    @Test
    public void ceaserCipher_instantiatesCorrectly_true() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        assertTrue(newCeasarCipher instanceof CeasarCipher);
    }
////    @Test
////    public void checkInput_checksIfKeyIsBetween1to25() throws Exception {
////        CeasarCipher newCeasarCipher = new CeasarCipher();
////        assertEquals(true, newCeasarCipher.isInRange("z", 25));
////    }
//
//
//    @Test
//    public void CeaserCipher_allowsUppercaseInput_string() {
//        CeasarCipher newCeasarCipher = new CeasarCipher();
//        String result = " ATTACKATDAWN";
//        assertEquals(result, newCeasarCipher.encryption("ATTACKATDAWN", 9));
//    }
//
//    @Test
//    public void ceaserCipher_doesEncryption_string() {
//        CeasarCipher newCeasarCipher = new CeasarCipher();
//        String output = new String();
//        String result = " ";
//        assertEquals(output, newCeasarCipher.encryption("pull", 4));
//
//    }
//
//    @Test
//    public void ceaserCipher_doesDecryption_string() {
//        CeasarCipher newCeasarCipher = new CeasarCipher();
//        String output = new String();
//        output = "hello";
//        assertEquals(output, newCeasarCipher.decryption("doll", 4));
//    }
//
//    @Test
//    public void decryption_takesInUppercaseLetters_string() {
//        CeasarCipher newCeasarCipher = new CeasarCipher();
//        String result = " ";
//        assertEquals(result, newCeasarCipher.decryption("byffi", 9));
//    }


}