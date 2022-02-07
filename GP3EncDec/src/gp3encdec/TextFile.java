/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp3encdec;

import java.io.*;
import java.util.*;

/**
 *
 * @author samue
 */
public class TextFile {

    public String path;
    public String fileContent;

    public TextFile(String path) throws IOException {
        this.path = path;
    }

    public void encrypt() {
    }

    public void decrypt() {
    }

    public void saveToDisk(String path) { // throws IOException?
    }

    public static String readFile(String path) throws IOException {
        Scanner fileScanner = new Scanner(new File(path));
        String text = fileScanner.useDelimiter("\\A").next();
        fileScanner.close();
        return text;
    }

}
