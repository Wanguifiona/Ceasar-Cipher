

package model;

public class CeasarCipher {

    private int shift = 9;

    public static StringBuffer encryption(String oMessage, int shift ){

        StringBuffer result = new StringBuffer();
        for(int i = 0; i < oMessage.length(); i++){
            if (Character.isUpperCase(oMessage.charAt(i))) {
                char ch = (char) (((int) oMessage.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            }else {
                char ch = (char) (((int) oMessage.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }




    public static StringBuffer decryption(String cMessage, int shift ){

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < cMessage.length(); i++) {
            if (Character.isUpperCase(cMessage.charAt(i))) {
                char ch = (char) (((int) cMessage.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cMessage.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public int getShift() {
        return shift;
    }


}
