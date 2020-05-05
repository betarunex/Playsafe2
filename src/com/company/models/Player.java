package com.company.models;

public class Player {
    private String name;
    private double winTotal;
    private double totalBet;

    public Player(final String name, final double winTotal, final double totalBet) {
        this.name = name;
        this.winTotal = winTotal;
        this.totalBet = totalBet;
    }

    public Player(final String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWinTotal() {
        return winTotal;
    }

    public void addWinTotal(double winTotal) {
        this.winTotal += winTotal;
    }

    public double getTotalBet() {
        return totalBet;
    }

}
