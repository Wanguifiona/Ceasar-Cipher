
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
        if (response.equals("yes")) {
            String cMessage = encryption(oMessage, shift).toString();

            System.out.print("Your deciphered text: " + cMessage);

            System.out.println("\n\nEnter Shift Key:");
            shift = input.nextInt();
            String decryptedPlainText = decryption(cMessage, 26 - shift).toString();
            System.out.println("The  message: " + decryptedPlainText);

        } else {
            System.out.println("Please try again");
        }


    }
}