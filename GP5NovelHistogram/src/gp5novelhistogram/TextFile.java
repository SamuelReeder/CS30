/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp5novelhistogram;

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
        Files.write(Path.of(path), Arrays.asList(this.fileContent.split("\n")));
    }

    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Path.of(path)));
    }
}
