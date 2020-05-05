package com.company;

import com.company.models.Player;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final GameMain game = new GameMain();
        Scanner scan = new Scanner(System.in);
        String line = "";
        String[] lines;
        while(game.isRunning()) {
            System.out.println("Awaiting new bets");
            line = scan.nextLine();
            lines = line.split(" ");
            game.addBet(lines[0], lines[0], Double.parseDouble(lines[0]));
            // main thread take user input
            // stop game game.endGame();
        }

    }
}
