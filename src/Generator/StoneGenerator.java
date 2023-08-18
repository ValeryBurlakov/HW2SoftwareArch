package Generator;

import Source.IGameItem;
import Source.ItemFabric;
import Reward.StoneReward;

public class StoneGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new StoneReward();
    }
}

