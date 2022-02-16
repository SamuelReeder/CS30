/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

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
    
    public static CharProbability[] charProbabilitiesOf(String theTextStr) {
        CharFrequency[] charFreqs = charFrequenciesOf(theTextStr);
        int totalLetterCount = 0;
        for (CharFrequency charFreq : charFreqs) {
            totalLetterCount += charFreq.getFrequency();
        }
        
        CharProbability[] charProbs = new CharProbability[charFreqs.length];
        
        for (int i = 0; i < charFreqs.length;i++) {
            CharFrequency currentCharFreq = charFreqs[i];
            
            CharProbability charProb = new CharProbability(currentCharFreq.getChar(), (float)((float)currentCharFreq.getFrequency() / (float)totalLetterCount));
            charProbs[i] = charProb;
        }
        
        return charProbs;
        
    }
    
    public static CharProbability[] sortedCharProbabilitiesOf(String theTextStr) throws ArrayIndexOutOfBoundsException {
        CharProbability[] charProbs = charProbabilitiesOf(theTextStr);
        
        boolean sorted = false;
        while (!sorted) {
            boolean swapped = false;
            for (int i = 0; i < charProbs.length - 1; i++) {
                CharProbability curr = charProbs[i];
                
                    CharProbability next = charProbs[i + 1];
                
                if (curr.getProbability() < next.getProbability()) {
                    charProbs[i] = next;
                    charProbs[i + 1] = curr;
                    swapped = true;
                }
            }
            if (!swapped) {
                sorted = true;
            }
        }
        return charProbs;
    }
}
