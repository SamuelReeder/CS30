/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp5novelhistogram;

/**
 *
 * @author samue
 */
public class CryptoAnalysis {
     public static CharFrequency[] charFrequenciesOf(String theTextStr) {
        CharFrequency[] charFreqs = new CharFrequency[10+26+26]; // 0 to 9, a to z, A to Z
        for (int i = 0; i < charFreqs.length; i++) {
            CharFrequency newChar = new CharFrequency((char)i);
            charFreqs[i] = newChar;
        }
        
        return charFreqs;
    }
}
