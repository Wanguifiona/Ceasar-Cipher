

package model;

public class CeasarCipher {
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



    public static String encryption(String oMessage, int Key ){
        oMessage = oMessage.toUpperCase();
        String cMessage = "";
        for(int i = 0; i < oMessage.length(); i++){
            int charIndex = alphabet.indexOf(oMessage.charAt(i));
            //example i = 8(index)
            // encryption  i = 8 + 9(key) = 17 = r
            int newIndex = (charIndex + Key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cMessage = cMessage + cipherChar;

        }
        return cMessage;
    }
    public static String decryption(String cMessage, int Key ){
        cMessage = cMessage.toUpperCase();
        String oMessage = "";
        for(int i = 0; i < cMessage.length(); i++) {
            int charIndex = alphabet.indexOf(cMessage.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex<0){
                newIndex = alphabet.length() + newIndex;
            }
            char ordinaryChar = alphabet.charAt(newIndex);
            oMessage = oMessage + ordinaryChar;

        }
        return oMessage;


    }


}
