package com.company.models;

public class PlayerBet {
    private String playerName;
    private String betType;
    private double betAmount;

    public PlayerBet(final String playerName, final String betType, final double betAmount) {
        this.playerName = playerName;
        this.betType = betType;
        this.betAmount = betAmount;
    }
}
