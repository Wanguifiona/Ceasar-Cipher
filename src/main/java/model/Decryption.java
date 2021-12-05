
package model;

public class Decryption {

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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