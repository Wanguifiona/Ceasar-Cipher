import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


import static model.CeasarCipher.decryption;
import static model.CeasarCipher.encryption;



public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Message:");
        String ordinary = bufferedReader.readLine();

        System.out.println("Enter Key:");
        int Key = Integer.parseInt( bufferedReader.readLine());

        String cipherText = encryption( ordinary, Key);

        System.out.println("The encryption message:" + cipherText);

        System.out.println("The decryption message:" + decryption(cipherText, Key));



    }
}