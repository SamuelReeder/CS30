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
        char[] charArr = theTextStr.toCharArray();
        CharFrequency[] charFreqs = new CharFrequency[141];
        for (int i = 0; i < charFreqs.length; i++) {
            charFreqs[i] = new CharFrequency((char)i);
        }
        for (int i = 0; i < charArr.length; i++) {
            char currentChar = charArr[i];
            for (CharFrequency currentCharFreq : charFreqs) {
                if (currentCharFreq.getChar() == currentChar) {
                    currentCharFreq.plusOne();
                    break;
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
        
        int firstZeroProbIdx = -1;
        for (int i = 0; i < charProbs.length; i++) {
            if (firstZeroProbIdx == -1 && charProbs[i].getProbability() == 0) {
                firstZeroProbIdx = i;
            }
        }
        
        CharProbability[] filteredCharProbs = new CharProbability[firstZeroProbIdx];
        for (int i = 0; i < firstZeroProbIdx; i++) {
            filteredCharProbs[i] = charProbs[i];
        }
        return filteredCharProbs;
    }
    
    public static String approxDecrypt(String cipherTxt, String charListSortedByProbabilities) {
        CharProbability[] cipherCharListSortedByProbabilities = sortedCharProbabilitiesOf(cipherTxt);
        
        int resultantLength = charListSortedByProbabilities.length();
        if (resultantLength > cipherCharListSortedByProbabilities.length) {
            resultantLength = cipherCharListSortedByProbabilities.length;
        }
        
        char[] arr = cipherTxt.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            int currentCipherCharIndex = -1;
            
            for (int j = 0; j < resultantLength; j++) {
                if (cipherCharListSortedByProbabilities[j].getChar() == currentChar) {
                    currentCipherCharIndex = j;
                }
            }
            
            if (currentCipherCharIndex > -1) {
                char decryptedChar = charListSortedByProbabilities.charAt(currentCipherCharIndex);
                arr[i] = decryptedChar;
            }
                       
        }
        
        return new String(arr);
    }
}
