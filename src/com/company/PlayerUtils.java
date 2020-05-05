package com.company;

import com.company.models.Player;

import java.io.File;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class PlayerUtils {

    public static Set<Player> loadPlayers() {
        Set<Player> players = new HashSet<>();
        try {
            final File file = new File("src/input.txt");
            final Scanner scanner = new Scanner(file);
            String line = "";
            String[] lines = new String[3];
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lines = line.split(" ");
                Player player = new Player(lines[0], Double.parseDouble(lines[0]), Double.parseDouble(lines[0]));
                players.add(player);
            }
        } catch (Exception e) {

        }
        return players;
    }

    public static Player getPlayer(final Set<Player> players, final String name){
        Optional<Player> player = players.stream().filter(play -> play.getName() == name).findFirst();
        return player.isPresent() ? player.get() : null;
    }
}
