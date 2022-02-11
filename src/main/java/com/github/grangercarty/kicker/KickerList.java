package com.github.grangercarty.kicker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KickerList {

    Kicker[] kickers = new Kicker[1995];
    int headerSize;

    public KickerList(String filename, int headerSize) {
        this.headerSize = headerSize;
        File file = new File(filename);
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\n");
            int i = 0;
            while (sc.hasNext()) {
                String rawKicker = sc.next();
                if ( ! (i < headerSize) ) {
                    kickers[i] = new Kicker(rawKicker);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printNames() {
        for (int i = headerSize; i< kickers.length; i++) {
            kickers[i].printName();
        }
    }
}
