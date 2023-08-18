package Source;

import Source.ItemFabric;

import java.util.List;
import java.util.Random;

public class FabricController {
    private List<ItemFabric> fabricList;

    public FabricController(List<ItemFabric> fabricList) {
        this.fabricList = fabricList;
    }

    public void openRewardMultipleTimes(int numTimes) {
        Random rnd = new Random();

        for (int i = 0; i < numTimes; i++) {
            int index = rnd.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
