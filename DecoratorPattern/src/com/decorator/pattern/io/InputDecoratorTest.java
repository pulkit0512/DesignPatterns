package com.decorator.pattern.io;

import java.io.*;

// Decorates the input convert all the uppercase characters to lowercase by decorating FileInputStream using
// FilterInputStream decorator class.
public class InputDecoratorTest {

    public static void main(String[] args) {
        int c;

        try(InputStream is = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("test.txt")))){
            while((c=is.read())>=0){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
