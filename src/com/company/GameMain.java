package com.company;

import com.company.models.Player;

import java.util.Set;

public class GameMain {
    private Set<Player> players;
    private RouletteWheel rouletteWheel;
    private boolean isRunning;

    public GameMain() {
        this.players = PlayerUtils.loadPlayers();
        this.rouletteWheel = new RouletteWheel();
        this.isRunning = true;
        startRoulette();
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
