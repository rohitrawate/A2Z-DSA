package com.rohit.Core;

public class StringClass {
    static void main() {
        System.out.println("String Class : ");

        String name = "RoRhit";
        char c = name.charAt(0);
        char e = name.charAt(name.length()-1);
        System.out.println(name.replace(c,e)); // Replacesall occurences
    }
}
