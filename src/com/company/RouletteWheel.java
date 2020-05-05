package com.company;

import com.company.models.PlayerBet;

import java.util.List;

public class RouletteWheel extends Thread{
    private boolean stop = false;
    private List<PlayerBet> bets;

    public void stopRoulette() {
        this.stop = true;
    }

    public void addBet(final String player, final String betType, final double betAmount) {
        PlayerBet bet = new PlayerBet(player, betType, betAmount);
        bets.add(bet);
    }

    @Override
    public void run() {
        while(true) {
            if(this.stop) {
                return;
            }
            try {
                this.sleep(5000);
                // end betting round
            } catch (Exception e) {

            }
        }
    }
}