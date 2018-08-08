package be.machinelearning.animalshelter.ml.models.weka;

import org.junit.Test;
import weka.core.Instances;

import static org.assertj.core.api.Assertions.assertThat;


public class WekaModalFactoryTest {

    private WekaModalFactory wekaModalFactory = new WekaModalFactory();

    @Test
    public void getTrainingSet() throws Exception {
        Instances actual = wekaModalFactory.getTrainingSet("../../data/firstItemsForTesting.csv");

        // check how to load firstItemsForTesting file (seems to still have too much data)
    }
}