/**
 * Author: shineehcj
 * Date: 10:35  12/28/2019
 * Motto:love Java,love Python and Enjoy Life...
 */

package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo01 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("D:\\111\\11.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
