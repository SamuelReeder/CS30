/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp5novelhistogram;

import java.io.IOException;

/**
 *
 * @author samue
 */
public class GP5NovelHistogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String fileContent = TextFile.readFile("Adventures_of_Sherlock_Holmes.txt");
        
        CharFrequency charFreqs[] = CryptoAnalysis.charFrequenciesOf(fileContent);
        
        for (CharFrequency charFreq : charFreqs) {
            System.out.println(charFreq.toString());
        }
    }
    
}
