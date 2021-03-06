/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp3encdec;

import java.io.IOException;

/**
 *
 * @author samue
 */
public class GP3EncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String plainFilePath = "Iliad_Homer.txt";
        String encryptedFilePath = "Iliad_Homer_Encrypted.txt"; 
        
        TextFile homer = new TextFile(plainFilePath); 
        System.out.println(homer.fileContent);
        
        homer.encrypt();
        System.out.println(homer.fileContent);
                
        homer.decrypt();
        System.out.println(homer.fileContent);
        
        homer.encrypt();
        homer.saveToDisk(encryptedFilePath);
    }
    
}
