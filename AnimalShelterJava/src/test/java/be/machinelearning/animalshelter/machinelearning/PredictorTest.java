package be.machinelearning.animalshelter.machinelearning;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PredictorTest {

    @Test
    public void predict_ShouldReturnPrediction() {
        assertThat(new Predictor().predict()).isEqualTo("prediction");
    }

}