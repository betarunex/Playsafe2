package com.company;

import com.company.models.Player;

import java.io.File;
import java.util.*;

public class PlayerUtils {

    public static Map<String, Player> loadPlayers() {
        Map<String, Player> players = new HashMap<>();
        try {
            final File file = new File("src/input.txt");
            final Scanner scanner = new Scanner(file);
            String line = "";
            String[] lines = new String[3];
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lines = line.split(" ");
                Player player = new Player(lines[0], Double.parseDouble(lines[1]), Double.parseDouble(lines[2]));
                players.put(lines[0], player);
            }
        } catch (Exception e) {

        }
        return players;
    }

    public static Player getPlayer(final Map<String, Player> players, final String name){
        return players.get(name);
    }
}
