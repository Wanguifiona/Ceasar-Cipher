package model;

public class Encryption {
        static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


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


}


