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
        CharFrequency[] charFreqs = new CharFrequency[10 + 26 + 26]; // 0 to 9, a to z, A to Z
        for (int i = 0; i < charFreqs.length; i++) {
            if (i < 10) {
                charFreqs[i] = new CharFrequency((char)(i + 48));
            } else if (i < 36) {
                charFreqs[i] = new CharFrequency((char)(i + 87));
            } else {
                charFreqs[i] = new CharFrequency((char)(i + 29));
            }
        }
        for (int i = 0; i < theTextStr.length(); i++) {
            char currentChar = theTextStr.charAt(i);
            for (CharFrequency currentCharFreq : charFreqs) {
                if (currentCharFreq.getChar() == (int) currentChar) {
                    currentCharFreq.plusOne();
                }
            }
        }

        return charFreqs;
    }
}
