package Generator;

import Source.IGameItem;
import Source.ItemFabric;
import Reward.GoldReward;

public class GoldGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
