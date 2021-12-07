package model;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CeasarCipherTest {

    @Test
    public void encryption_allUpperCase_String() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String oMessage = "CEASAR CIPHER";
        assertEquals(oMessage, CeasarCipher.encryption("ceasar cipher", 1));
    }
    @Test
    public void encryption_checkEmptyString(){
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String oMessage = "";
        assertEquals(oMessage,CeasarCipher.encryption("ceasar cipher,", 1 ) );

    }
    @Test
    public void encryption_testForMessage() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String Letter = "I";
        assertEquals(Letter, CeasarCipher.encryption("H", 1));
    }



    @Test
    public void decryption_allUpperCase_String() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String cMessage = "CEASAR CIPHER";
        assertEquals(cMessage, CeasarCipher.decryption("ceasar cipher", 1));
    }
    @Test
    public void decryption_checkEmptyString(){
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String oMessage = "";
        assertEquals(oMessage,CeasarCipher.decryption("ceasar cipher,", 1 ) );

    }
    @Test
    public void decryption_testForMessage() {
        CeasarCipher newCeasarCipher = new CeasarCipher();
        String Letter = "G";
        assertEquals(Letter, CeasarCipher.decryption("H", 1));
    }
}