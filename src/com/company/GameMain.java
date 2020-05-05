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

    public void addBet(final String player, final String betType, final double betAmount) {
        if (players.get(player) != null) {
            rouletteWheel.addBet(player, betType, betAmount);
        }
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
