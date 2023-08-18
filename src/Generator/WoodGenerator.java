package Generator;

import Source.IGameItem;
import Source.ItemFabric;
import Reward.WoodReward;

public class WoodGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new WoodReward();
    }
}

