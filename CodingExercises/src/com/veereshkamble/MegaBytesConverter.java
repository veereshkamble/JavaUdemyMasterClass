package com.veereshkamble;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int mB = kiloBytes / 1024;
        int kB = kiloBytes % 1024;

        System.out.println(kiloBytes + "KB = " + mB + " MB and " + kB + "KB");
    }
}
