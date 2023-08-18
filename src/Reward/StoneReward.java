package Reward;

import Source.IGameItem;

public class StoneReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("STONE");
    }
}
