package Reward;

import Source.IGameItem;

public class GoldReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("GOLD");
    }
}