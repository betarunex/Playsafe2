package com.company;

public class RouletteWheel extends Thread{
    private boolean stop = false;

    public void stopRoulette() {
        this.stop = true;
    }

    @Override
    public void run() {
        while(true) {
            if(this.stop) {
                return;
            }
            try {
                this.sleep(5000);
            } catch (Exception e) {

            }
        }
    }
}
