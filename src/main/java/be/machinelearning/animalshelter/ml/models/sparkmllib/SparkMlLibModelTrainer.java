package be.machinelearning.animalshelter.ml.models.sparkmllib;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.mllib.regression.LabeledPoint;
import org.apache.spark.mllib.tree.DecisionTree;
import org.apache.spark.mllib.tree.model.DecisionTreeModel;
import org.apache.spark.mllib.util.MLUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static com.google.common.primitives.Ints.max;

public class SparkMlLibModelTrainer {
    private JavaSparkContext jsc;

    public SparkMlLibModelTrainer(String appName) {
        SparkConf sparkConf = new SparkConf()
                .setMaster("local")
                .setAppName(appName);
        this.jsc = new JavaSparkContext(sparkConf);
    }

    public DecisionTreeModel getTrainedModel() {
        File file = new File("./models/sparkDecisionTreeModel");
        if (file.exists()) {
            return loadDecisionTreeModel();
        }
        return trainDecisionTreeModel();
    }

    DecisionTreeModel trainDecisionTreeModel() {
        String trainingDataPath = "./data/train.csv";
        String testDataPath = "./data/test.csv";
        JavaRDD<LabeledPoint> trainingData = MLUtils.loadLibSVMFile(jsc.sc(), trainingDataPath).toJavaRDD();
        JavaRDD<LabeledPoint> testData = MLUtils.loadLibSVMFile(jsc.sc(), testDataPath).toJavaRDD();
        int numberOfClasses = 4;

        //TODO: fill automatically with right values, check OneHotEncoder
        Map<Integer, Integer> categoricalFeaturesInfo = new HashMap<>();
        //TODO: figure out if default impurity is possible and/or what the default is in sklearn
        String impurity = "gini";
        //TODO: figure out what this means, if there is a default and/or what the default is in sklearn
        int maxBins = 32;

        int maxDepth = max();

        DecisionTreeModel decisionTreeModel = DecisionTree.trainClassifier(trainingData, numberOfClasses, categoricalFeaturesInfo, impurity, maxDepth, maxBins);

        saveModel(decisionTreeModel);
        return decisionTreeModel;
    }

    private void saveModel(DecisionTreeModel decisionTreeModel) {
        decisionTreeModel.save(jsc.sc(), "./models/sparkDecisionTreeModel");
    }

    private DecisionTreeModel loadDecisionTreeModel() {
        return DecisionTreeModel.load(jsc.sc(), "./models/sparkDecisionTreeModel");
    }
}
