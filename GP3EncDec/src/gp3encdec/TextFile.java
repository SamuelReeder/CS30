/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp3encdec;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.*;

/**
 *
 * @author samue
 */
public class TextFile {

    public String path;
    public String fileContent;
    public String otherText;

    public TextFile(String path) throws IOException {
        this.path = path;
        this.fileContent = TextFile.readFile(this.path);
    }

    public void encrypt() {
        this.fileContent = new String(EnDecrypter.encrypt(this.fileContent.toCharArray()));
    }

    public void decrypt() {
        this.fileContent = new String(EnDecrypter.decrypt(this.fileContent.toCharArray()));
    }

    public void saveToDisk(String path) throws IOException {
        Files.write(Path.of(this.path), Arrays.asList(this.fileContent.split("\n")));
    }

    public static String readFile(String path) throws IOException {
        Scanner fileScanner = new Scanner(new File(path));
        String text = "";
        while (fileScanner.hasNextLine()) {
            text += fileScanner.nextLine() + "\n";
        }
//        String text = fileScanner.useDelimiter("\\A").next();
        fileScanner.close();
        return text;
    }

}
