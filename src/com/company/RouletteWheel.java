package com.company;

import com.company.models.Player;
import com.company.models.PlayerBet;

import java.util.List;

public class RouletteWheel extends Thread{
    private boolean stop = false;
    private List<PlayerBet> bets;

    public void stopRoulette() {
        this.stop = true;
    }

    public void addBet(final Player player, final String betType, final double betAmount) {
        PlayerBet bet = new PlayerBet(player, betType, betAmount);
        bets.add(bet);
    }

    public void endRound(){
        // swap out old bets for new one
        // run random winning roll
        // determine winners
        // print
        // foreach winning player, payout
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
