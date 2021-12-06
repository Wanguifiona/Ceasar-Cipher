package model;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class EncryptionTest {

   @Test
    public void encryption_allUpperCase_String() {
        Encryption newEncryption = new Encryption();
        String oMessage = "CEASAR CIPHER";
        assertEquals(oMessage, Encryption.encryption("ceasar cipher", 1));


    }
}