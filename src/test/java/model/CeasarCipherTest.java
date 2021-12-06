package model;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

    public class CeasarCipherTest {

        @Test
        public void encryption_allUpperCase_String() {
            Encryption newEncryption = new Encryption();
            String oMessage = "CEASAR CIPHER";
            assertEquals(oMessage, Encryption.encryption("ceasar cipher", 1));
        }
        @Test
        public void  decryption_allUpperCase_String() {
            Decryption newDecryption = new Decryption();
            String cMessage = "CEASAR CIPHER";
            assertEquals(cMessage, Decryption.decryption("ceasar cipher", 1));


        }
    }



