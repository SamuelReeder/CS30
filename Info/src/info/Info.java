/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

/**
 *
 * @author samue
 */
public class Info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Hi b hi b hi b hi";
        String str[] = s.split("b");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(str.length);
        
        System.out.println((int)'c');
    }
    
    public static void ch1() {
        x("println has line break after, print has no line break \n");
    }
    
     public static void ch2() {
        x("1_111_262_192 is a valid way to input ints. double means double precision \ndouble x; //this declares x to be of type double \nx = 1.6; //this initializes x to a value of 1.6");
        x("variable names must begin with letter or underscore, no spaces, only punctuation char allowed is _\n");
    }
    
     public static void ch3() {
         x("String method length() returns number of characters, begins counting from 1");
         x("Substring begins counting from 0 and includes the indice of the parameter. Second param indice is not included ");
         x("Escape sequences, \\ makes an exception for special characters like \", \\n is line break \\t is tab\n");
     }
     
     public static void ch4() {
         x("double x = 31.2, m = 37.09, zu, p = 43.917; can declare and initialize multiple variables in one line");
         x("x++ after used in statement, ++x increments before (same for subtraction) see 4-3");
         x("When ints are divided, the decimcal is neglected\n");
     }
     
     public static void ch5() {
         x("Java will not typically store info in a variable if information will be lost");
         x("Can cast to force storage");
         x("In an operation between two different data types, the answer will be provided with the precision of the most precise data type used");
         x("double d = (double)5/4; //same as 5.0 / 4…(double) only applies to the 5 ");
         x("double d = (double)(5 / 4); //(5 / 4) is in its own little “world” and performs integer division yielding 1 which is then cast as a double, 1.0");
         x("Constants used keyword 'final' and should be all uppercase");
         x("j += x; is j = (int)(j + x);\n");
     }
     
     public static void ch6() {
         x("Refer to 6-1 for various Math methods");
         
     }
     
     public static void ch7() {
         x("Scanner methods can be used in any order, except for following nextInt() or nextDouble() with nextLine()");
     }
     
     public static void ch8() {
         x("order for boolean operators: ! == != && ||");
     }
     
     public static void ch12() {
         x("While runs condition at top of loop, while do tests condition at bottom (after code has run");
     }
     
     public static void ch13() {
         x("Can store a char into an int (even store an int + char into an int), however, you cannot store an int into a char because of loss of precisions (can cast to override)");
         x("No strings and chars into eachother, however, can concatenate an empty string with a char to make a resultant string");
         x("Add 32 onto a char to make it small from caps, ex. char b = 'H'; char c = (char)(b + 32); c will be 'h'");
     }
     
     public static void ch15() {
         x("Class objects are instantiated");
     }
     
     public static void ch16() {
         x("private can only be accessed from within class");
         x("When a class is set to equal another class, they will be the same class with two references. When == checked, it will output true. Two different classes with same values will not be equal.");
         x("Strings are stored in string constant pool and thus two identical strings will equal eachother. Unless declared as such: String s = new String(\"\"); and s is compared with its counterpart");
         x("if public or private is not specified will behaved mostly like public");
         x("Numeric state variables are automatically initialized to 0. If in a method, it will not automatically be initialized.");
     }
     
     public static void ch17() {
         x("Probably review");
     }
     
     public static void ch18() {
         x("The value an array is declared with (new int[14])a is the length of arrary, however, since counting from 0 index 13 is the last element");
         x("\\s is whitespace, e|g is either e or g");
         x("For split method, to check if delimiter is at end of string (array.length - 1 counts number of delimiters), just add a harmless string so that the string can optimally be separated.");
     }
     
     public static void ch19() {
         x("Can set array to null to remove from memory (can set almost any object to null");
         x("enhanced for loop is read only for arrays");
     }
     
     public static void ch20() {
         x("Class methods (static variables) can be accessed without creating object of that class. Can still access them if object of class is created too");
         x("Static vars can be accessed interchangeably from all instances of class");
         x("Static vars can only reference other static vars from within class. Non-static methods can reference either static or state vars");
         x("static can be written before public, doesnt often happen however");
         x("public static final double PI = 3.14159; (constant)");
         x("System.out.println can be written as just out.println with appropriate imports, same with Math and other classes");
     }
     
     public static void ch21() {
         x("TODO along with maybe ch22");
     }
     
     public static void ch25() {
         x("always close any file related things, scanners, file writers, print writers, etc. Add true param onto end of file writer to append instead of replace");
         x("Printwriter true param at end will force file to update directly after code is run rather then after close");
     }
     
    public static void x(String str) {
        System.out.println(str);
    }
     
}
