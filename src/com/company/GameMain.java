package com.company;

import com.company.models.Player;

import java.util.*;

public class GameMain {
    private Map<String, Player> players;
    private RouletteWheel rouletteWheel;
    private boolean isRunning;

    public GameMain() {
        this.players = PlayerUtils.loadPlayers();
        this.rouletteWheel = new RouletteWheel();
        this.isRunning = true;
        startRoulette();
    }

    public void addBet(final String playerName, final String betType, final double betAmount) {
        Player player = players.get(playerName);
        if(player==null) {
            return;
        }
        rouletteWheel.addBet(player, betType, betAmount);
    }

    public void printOutPlayers() {
        System.out.format("%15s%15s%15s\n", "Player", "Total win", "Total bet");
        for (final Player player : players.values()) {
            System.out.format("%15s%15f%15f\n", player.getName(), player.getWinTotal(), player.getTotalBet());
        }
        System.out.println();
    }

    public void startRoulette() {
        rouletteWheel.start();
    }

    public void stopRoulette() {
        rouletteWheel.stopRoulette();
    }

    public void endGame() {
        stopRoulette();
        this.isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
