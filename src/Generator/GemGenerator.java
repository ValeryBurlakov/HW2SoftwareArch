package Generator;
import Source.IGameItem;
import Source.ItemFabric;
import Reward.GemReward;
public class GemGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
