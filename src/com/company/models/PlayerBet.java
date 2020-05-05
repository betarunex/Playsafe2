package com.company.models;

public class PlayerBet {
    private Player player;
    private String betType;
    private double betAmount;

    public PlayerBet(final Player player, final String betType, final double betAmount) {
        this.player = player;
        this.betType = betType;
        this.betAmount = betAmount;
    }
}
