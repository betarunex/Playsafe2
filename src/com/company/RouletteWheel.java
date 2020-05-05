package com.company;

import com.company.models.Player;
import com.company.models.PlayerBet;

import java.util.ArrayList;
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

    public double calculateWinnings(final String betType, final double betAmount, final int ballNumber) {
        switch (betType) {
            case("EVEN"):
                return ballNumber % 2 == 0 ? betAmount * 2 : 0;
            case("ODD"):
                return ballNumber % 2 == 1 ? betAmount * 2 : 0;
            default:
                try {
                    return Double.parseDouble(betType) == ballNumber ? betAmount * 36 : 0;
                } catch (Exception e) {
                    return 0;
                }
        }
    }

    public void endRound(){
        final List<PlayerBet> bets = this.bets;
        // handle edge case here
        this.bets = new ArrayList<>();
        int ballnumber = (int) (Math.random()*37);
        double winnings = 0;
        System.out.format("%25s%15s%10s%15s", "Player", "Bet", "Outcome", "Winnings");
        for (PlayerBet bet : bets) {
            winnings = calculateWinnings(bet.getBetType(), bet.getBetAmount(), ballnumber);
            final boolean win = winnings > 0;
            bet.getPlayer().addWinTotal(winnings);
            System.out.format("%25s%15d%10s%15d", bet.getPlayer().getName(), bet.getBetAmount(), win? "WIN" : "LOSE", winnings);
        }
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
