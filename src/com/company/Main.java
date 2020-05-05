package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            final File file = new File("src/input.txt");
            final Scanner scanner = new Scanner(file);
            String line = "";
            String[] lines = new String[3];
            String name = "";
            String betType = "";
            double betAmount = 0.0;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lines = line.split(" ");
                name = lines[0];
                betType = lines[1];
                betAmount = Double.parseDouble(lines[2]);
            }
        } catch (Exception e) {

        }
        // read file
        // run game
            // thread show game results
            // main thread take user input
        // end game
    }
}
