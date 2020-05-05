package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final GameMain game = new GameMain();
        Scanner scan = new Scanner(System.in);
        String line = "";
        String[] lines;
        while(game.isRunning()) {
            System.out.println("Awaiting new bets. 'p' to printout users totals, 'q' to quit ");
            line = scan.nextLine();
            if ("q".equals(line)) {
                game.endGame();
                return;
            } else if ("p".equals(line)) {
                game.printOutPlayers();
            } else {
                lines = line.split(" ");
                try {
                    game.addBet(lines[0], lines[1], Double.parseDouble(lines[2]));
                } catch (Exception e) {
                    System.out.println("There seems to have been an issue reading your bet. Please try again");
                }
            }
        }
    }
}
