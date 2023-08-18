package Reward;

import Source.IGameItem;

public class WoodReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("WOOD");
    }
}
