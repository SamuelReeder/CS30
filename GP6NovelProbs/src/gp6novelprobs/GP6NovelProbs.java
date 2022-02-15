/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp6novelprobs;

import java.io.IOException;

/**
 *
 * @author samue
 */
public class GP6NovelProbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String fileContent = TextFile.readFile("Adventures_of_Sherlock_Holmes.txt");
        
        CharProbability charProbs[] = CryptoAnalysis.charProbabilitiesOf(fileContent);
        
        float sum = 0;
        
        for (CharProbability charProb : charProbs) {
            System.out.println(charProb.toString());
            sum += charProb.getProbability();
        }
        
        System.out.println("sum = " + sum);
    }
    
}
