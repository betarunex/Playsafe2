package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final GameMain game = new GameMain();
        Scanner scan = new Scanner(System.in);
        String line = "";
        String[] lines;
        while(game.isRunning()) {
            System.out.println("Awaiting new bets");
            line = scan.nextLine();
            if (line == "q") {
                game.endGame();
                return;
            }
            lines = line.split(" ");
            game.addBet(lines[0], lines[0], Double.parseDouble(lines[0]));
        }

    }
}
