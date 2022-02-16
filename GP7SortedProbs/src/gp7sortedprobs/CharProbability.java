/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp7sortedprobs;

/**
 *
 * @author samue
 */
public class CharProbability {
    
    private char letter;
    private float probability;

    public CharProbability(char letter) {
        this.letter = letter;
    }
    
    public CharProbability(char letter, float prob) {
        this.letter = letter;
        this.probability = prob;
    }
        
    public float getProbability() {
        return this.probability;
    }

    public char getChar() {
        return this.letter;
    }
    
    @Override
    public String toString(){
        return this.letter + " = " + this.probability;
    }
    
}
