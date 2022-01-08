
import model.CeasarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


import static model.CeasarCipher.decryption;
import static model.CeasarCipher.encryption;



public class App {
    public static void main(String[] args) {
//
        Scanner input = new Scanner(System.in);
        int shift = 0;
        System.out.println("Enter the String for Encryption: ");
       String oMessage = input.next();
        System.out.println("Enter Shift Key:");
        shift = input.nextInt();
        System.out.println("The encryption message: " + encryption(oMessage, shift));


        System.out.println("Type 'yes' in order to revert your text back to the original...");
        String response = input.next();
        if(response.equals("yes")){
            String  cMessage =  encryption(oMessage, shift).toString();

            System.out.print("Your deciphered text: " + cMessage);

            System.out.println("\n\nEnter Shift Key:");
            shift = input.nextInt();
            String decryptedPlainText = decryption(cMessage, 26 - shift).toString();
            System.out.println("The  message: " + decryptedPlainText);

        } else{
            System.out.println("Please try again");
        }




//
//        String oMessage = new String();
//        int shift = 0;
//        System.out.print("Enter the String for Encryption:");
//        oMessage = input.next();
//
//        System.out.println("\n\nEnter Shift Key:");
//        shift = input.nextInt();
//        System.out.println("\nEncrpyted msg:" + encryption(oMessage, shift));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String originalText = "ATTACKATONCE";
//        System.out.println("Encryption");
//        System.out.println("Enter Message :");
////        String originalText = bufferedReader.readLine();
//        int shiftCount = 1;
////        System.out.println("Enter Key:");
////        int shiftCount = Integer.parseInt( bufferedReader.readLine());
//        System.out.println("Enter Key:");
//        System.out.println("Caesar Cipher Example");
//        System.out.println("Encryption: " + originalText);
//        System.out.println("Text  : " + originalText);
//        System.out.println("Shift : " + shiftCount);
//
//        System.out.println("Decryption");
//        String cMessage = encryption(originalText, shiftCount).toString();
//        System.out.println("Encrypted Cipher: " + cMessage);
//
//        System.out.println("Encrypted Cipher: " + cMessage);
//        System.out.println("Shift : " + shiftCount);
//        String decryptedPlainText = decryption(cMessage, 26 - shiftCount).toString();
//        System.out.println("Decrypted Plain Text  : " + decryptedPlainText);
    }
}