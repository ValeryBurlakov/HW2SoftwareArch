import Generator.GemGenerator;

import java.util.ArrayList;
import java.util.List;

import Generator.GoldGenerator;
import Generator.StoneGenerator;
import Generator.WoodGenerator;
import Source.FabricController;
import Source.ItemFabric;

public class Main {
    public static void main(String[] args) {

        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new WoodGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new StoneGenerator());

        FabricController fabricController1 = new FabricController(fabricList);
        fabricController1.openRewardMultipleTimes(20);
    }
}